import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ArticleResponse } from '../interfaces/dto/articleResponse.interface';
import { Article } from '../interfaces/models/article.interface';



@Injectable({
  providedIn: 'root'
})
export class ArticlesService {

  private pathService = 'api/articles';

  constructor(private httpClient: HttpClient) { }

  public all(): Observable<ArticleResponse> {
    return this.httpClient.get<ArticleResponse>(this.pathService);
  }

  public detail(id: string): Observable<Article> {
    return this.httpClient.get<Article>(`${this.pathService}/${id}`);
  }

  public create(form: FormData): Observable<ArticleResponse> {
    return this.httpClient.post<ArticleResponse>(this.pathService, form);
  }

  public update(id: string, form: FormData): Observable<ArticleResponse> {
    return this.httpClient.put<ArticleResponse>(`${this.pathService}/${id}`, form);
  }
}
