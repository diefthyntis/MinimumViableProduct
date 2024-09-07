import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TopicResponse } from '../interfaces/dto/topicResponse.interface';


@Injectable({
  providedIn: 'root'
})
export class TopicsService {

  private pathService = 'api/topics';

  constructor(private httpClient: HttpClient) { }

  public all(): Observable<TopicResponse> {
    return this.httpClient.get<TopicResponse>(this.pathService);
  }

}
