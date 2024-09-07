import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { TopicsListComponent } from './topics-list/topics-list.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ProfileComponent } from './profile/profile.component';
import { ZoomArticleComponent } from './zoom-article/zoom-article.component';

export const routes: Routes = [
  { path: '',component:LandingComponent},
  { path: 'articles/:id',component:ZoomArticleComponent},
  { path: 'topics',component:TopicsListComponent},
  { path: 'login',component:LoginComponent},
  { path: 'register',component:RegisterComponent},
  { path: 'profile',component:ProfileComponent},

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
