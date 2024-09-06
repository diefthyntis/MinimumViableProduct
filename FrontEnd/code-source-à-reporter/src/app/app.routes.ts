import { Routes } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { ZoomArticleComponent } from './zoom-article/zoom-article.component';
import { TopicsListComponent } from './topics-list/topics-list.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ZoomTopicComponent } from './zoom-topic/zoom-topic.component';
import { ProfileComponent } from './profile/profile.component';


export const routes: Routes = [
    { path: '',component:LandingComponent},
    { path: 'articles/:id',component:ZoomArticleComponent},
    { path: 'topics',component:TopicsListComponent},
    { path: 'login',component:LoginComponent},
    { path: 'register',component:RegisterComponent},
    { path: 'topics/:id',component:ZoomTopicComponent},
    { path: 'profile',component:ProfileComponent},
  
    
    
];