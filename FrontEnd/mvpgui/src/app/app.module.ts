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
import { ZoomArticleComponent } from './zoom-article/zoom-article.component';
import { HeaderComponent } from './components/header/header.component';
import { AuthHeaderComponent } from './components/auth-header/auth-header.component';


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
    AuthHeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
