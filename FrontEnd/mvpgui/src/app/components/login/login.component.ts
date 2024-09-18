import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

import { SessionService } from 'src/app/services/session.service';
import { AuthSuccess } from '../../interfaces/dto/authSuccess.interface';
import { LoginRequest } from '../../interfaces/dto/loginRequest.interface'; 
import { AuthService } from '../../services/auth.service';
import { Speaker } from 'src/app/interfaces/models/speaker.interface';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent  {
  public hide = true;
  public onError = false;

  public form = this.fb.group({
    email: ['', [Validators.required, Validators.email]],
    password: ['', [Validators.required, Validators.min(3)]]
  });

  constructor(private authService: AuthService, 
    private fb: FormBuilder, 
    private router: Router,
    private sessionService: SessionService) { }

  public submit(): void {
    /*
    const loginRequest = this.form.value as LoginRequest;
    this.authService.login(loginRequest).subscribe(
      (response: AuthSuccess) => {
        localStorage.setItem('token', response.token);
        this.authService.me().subscribe((speaker: Speaker) => {
          this.sessionService.logIn(speaker);
          this.router.navigate(['/topics'])
        });
        this.router.navigate(['/topics'])
      },
      error => this.onError = true
    );
    */
    
    this.router.navigateByUrl('topics');
  }
}