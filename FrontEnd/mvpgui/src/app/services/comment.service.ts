import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CommentResponse } from '../interfaces/dto/commentResponse.interface';



@Injectable({
  providedIn: 'root'
})
export class CommentsService {

  private pathService = 'api/Comments';

  constructor(private httpClient: HttpClient) { }

  public all(): Observable<CommentResponse> {
    return this.httpClient.get<CommentResponse>(this.pathService);
  }

  public detail(id: string): Observable<Comment> {
    return this.httpClient.get<Comment>(`${this.pathService}/${id}`);
  }

  public create(form: FormData): Observable<CommentResponse> {
    return this.httpClient.post<CommentResponse>(this.pathService, form);
  }

  public update(id: string, form: FormData): Observable<CommentResponse> {
    return this.httpClient.put<CommentResponse>(`${this.pathService}/${id}`, form);
  }
}
