import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingComponent } from './components/landing/landing.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { TopicsListComponent } from './components/topics-list/topics-list.component';
import { ArticlesListComponent } from './components/articles-list/articles-list.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ZoomArticleComponent } from './components/zoom-article/zoom-article.component';
import { HeaderComponent } from './components/header/header.component';
import { AuthHeaderComponent } from './components/auth-header/auth-header.component';
import { FormsModule } from '@angular/forms';
import { SignupComponent } from './components/signup/signup.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    LoginComponent,
    RegisterComponent,
    TopicsListComponent,
    ArticlesListComponent,
    ProfileComponent,
    ZoomArticleComponent,
    HeaderComponent,
    AuthHeaderComponent,
    SignupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
