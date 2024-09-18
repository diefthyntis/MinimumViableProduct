import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

import { Speaker } from '../interfaces/models/speaker.interface';

@Injectable({
  providedIn: 'root'
})
export class SessionService {

  public isLogged = false;
  public speaker: Speaker | undefined;

  private isLoggedSubject = new BehaviorSubject<boolean>(this.isLogged);

  public $isLogged(): Observable<boolean> {
    return this.isLoggedSubject.asObservable();
  }

  public logIn(speaker: Speaker): void {
    this.speaker = speaker;
    this.isLogged = true;
    this.next();
  }

  public logOut(): void {
    localStorage.removeItem('token');
    this.speaker = undefined;
    this.isLogged = false;
    this.next();
  }

  private next(): void {
    this.isLoggedSubject.next(this.isLogged);
  }
}
