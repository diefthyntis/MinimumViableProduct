import { Component, OnInit } from '@angular/core';
import { TopicResponse } from 'src/app/interfaces/dto/topicResponse.interface';
import { Speaker } from 'src/app/interfaces/models/speaker.interface';
import { Topic } from 'src/app/interfaces/models/topic.interface';
import { SessionService } from 'src/app/services/session.service';
import { TopicService } from 'src/app/services/topic.service';

@Component({
  selector: 'app-topics-list',
  templateUrl: './topics-list.component.html',
  styleUrls: ['./topics-list.component.scss']
})
export class TopicsListComponent implements OnInit {


  

  constructor(
    private sessionService: SessionService,
    private topicService: TopicService
  ) { }
 

  get speaker(): Speaker | undefined {
    return this.sessionService.speaker;
  }

  public topicResponseList: TopicResponse[] = [];

  async ngOnInit() {
    try {
      // Appel synchrone de la méthode pour récupérer les topics
      this.topicResponseList = await this.topicService.getTopics();
    } catch (error) {
      console.error('Erreur lors de la récupération des topics:', error);
    }
  }

}

  