import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-topics-list',
  templateUrl: './topics-list.component.html',
  styleUrls: ['./topics-list.component.scss']
})
export class TopicsListComponent implements OnInit {

  arrayTopics:Topic[]=[];
  
  constructor(private instanceTopicService: TopicService){};
  
  ngOnInit(): void {
      this.arrayTopics=this.instanceTopicService.getAll();
  
    
  }

}

  