import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Speaker } from '../interfaces/models/speaker.interface';

@Injectable({
  providedIn: 'root'
})
export class SpeakerService {

  private pathService = 'api/me';

  constructor(private httpClient: HttpClient) { }

  public getSpeakerById(id: number): Observable<Speaker> {
    return this.httpClient.get<Speaker>(`${this.pathService}/${id}`);
  }
}