

import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthSuccess } from 'src/app/interfaces/dto/authSuccess.interface';

import { RegisterRequest } from 'src/app/interfaces/dto/registerRequest.interface';
import { Speaker } from 'src/app/interfaces/models/speaker.interface';

import { AuthService } from 'src/app/services/auth.service';
import { SessionService } from 'src/app/services/session.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent  {

  public onError = false;


  public invalidFormMessage = false;  // Variable pour afficher le message "formulaire non valide"


  public form = this.fb.group({
    emailaddress: ['', [Validators.required, Validators.email]],
    pseudonym: ['', [Validators.required, Validators.minLength(7)]],
    password: ['', [Validators.required, Validators.minLength(8)]]
  });

  /*
  private authService: AuthService,,
    private sessionService: SessionService
  */

  constructor(
    private fb: FormBuilder,
    private router: Router) { }

    /*
    Lorsque le formulaire est soumis, les valeurs sont récupérées 
    via this.form.value et castées en un objet de type RegisterRequest.
    */

  /*
    La méthode authService.register() est appelée pour envoyer les données à l'API.
    Si la requête réussit, le jeton d'authentification est stocké dans le localStorage, 
    et la méthode authService.me() est appelée pour récupérer les informations de l'utilisateur connecté. 
    Ensuite, l'utilisateur est redirigé vers la page /topics.
    En cas d'erreur, une variable onError est définie sur true, 
    ce qui peut être utilisé pour afficher un message d'erreur à l'utilisateur.
    */
    public submit(): void {}

    /*
  public submit(): void {
    if (this.form.invalid) {
      this.invalidFormMessage = true; // Affiche le message d'erreur
      return;
    }
    const registerRequest = this.form.value as RegisterRequest;
    

    
    this.authService.register(registerRequest).subscribe(
      (response: AuthSuccess) => {
        localStorage.setItem('token', response.token);
        this.authService.me().subscribe((speaker: Speaker) => {
          this.sessionService.logIn(speaker);
          this.router.navigate(['/topics'])
        });
      },
      error => {
        return this.onError = true;
      }
        
    );
    
  
  }
*/
}
