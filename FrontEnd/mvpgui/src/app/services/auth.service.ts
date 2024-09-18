import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RegisterRequest } from '../interfaces/dto/registerRequest.interface';
import { AuthSuccess } from '../interfaces/dto/authSuccess.interface';
import { LoginRequest } from '../interfaces/dto/loginRequest.interface';
import { Speaker } from '../interfaces/models/speaker.interface';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private pathService = 'api/auth';

  constructor(private httpClient: HttpClient) { }

  public register(registerRequest: RegisterRequest): Observable<AuthSuccess> {
    return this.httpClient.post<AuthSuccess>(`${this.pathService}/register`, registerRequest);
  }

  public login(loginRequest: LoginRequest): Observable<AuthSuccess> {
    return this.httpClient.post<AuthSuccess>(`${this.pathService}/login`, loginRequest);
  }

  public me(): Observable<Speaker> {
    return this.httpClient.get<Speaker>(`${this.pathService}/me`);
  }
}
