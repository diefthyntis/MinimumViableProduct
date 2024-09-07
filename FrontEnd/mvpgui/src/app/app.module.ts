import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingComponent } from './landing/landing.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { TopicsListComponent } from './topics-list/topics-list.component';
import { ArticlesListComponent } from './articles-list/articles-list.component';
import { ProfileComponent } from './profile/profile.component';
import { ZoomArticleComponent } from './zoom-article/zoom-article.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    LoginComponent,
    RegisterComponent,
    TopicsListComponent,
    ArticlesListComponent,
    ProfileComponent,
    ZoomArticleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
