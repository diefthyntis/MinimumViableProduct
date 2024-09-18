import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LandingComponent } from './components/landing/landing.component';
import { TopicsListComponent } from './components/topics-list/topics-list.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ZoomArticleComponent } from './components/zoom-article/zoom-article.component';
import { ArticlesListComponent } from './components/articles-list/articles-list.component';

export const routes: Routes = [
  { path: '',component:LandingComponent},
   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


/*
 { path: 'articles/:id',component:ZoomArticleComponent},
  { path: 'topics',component:TopicsListComponent},
  { path: 'login',component:LoginComponent},
  { path: 'register',component:RegisterComponent},
  { path: 'profile',component:ProfileComponent},
  { path: 'articles',component:ArticlesListComponent},

  */