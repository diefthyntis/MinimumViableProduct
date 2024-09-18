import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { lastValueFrom, Observable } from 'rxjs';
import { TopicResponse } from '../interfaces/dto/topicResponse.interface';
import { Topic } from '../interfaces/models/topic.interface';


@Injectable({
  providedIn: 'root'
})
export class TopicService {

  private pathService = 'api/topics';

  constructor(private httpClient: HttpClient) { }

  private apiUrl = 'http://localhost:3001/api/topics';  // L'URL de votre API backend

  
  public all(): Observable<TopicResponse> {
    return this.httpClient.get<TopicResponse>(this.pathService);
  }

   // Méthode pour récupérer les topics en mode synchrone avec async/await
   public async getTopics(): Promise<TopicResponse[]> {
    // Utilisation de lastValueFrom pour convertir l'Observable en Promesse
    const topicsResponse: TopicResponse[] = await lastValueFrom(this.httpClient.get<TopicResponse[]>(this.apiUrl));
    
    return topicsResponse;  // Retourne les données une fois récupérées
  }


}
