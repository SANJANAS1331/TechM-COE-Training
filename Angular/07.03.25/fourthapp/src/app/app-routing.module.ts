import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { CoursesComponent } from './pages/courses/courses.component';
import { CourseCardComponent } from './pages/courses/course-card/course-card.component';
import { QuizzesComponent } from './pages/quizzes/quizzes.component';
import { QuizCardComponent } from './pages/quizzes/quiz-card/quiz-card.component';
import { ResultsComponent } from './pages/results/results.component';
import { ContactComponent } from './pages/contact/contact.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'courses', component: CoursesComponent },
  { path: 'course/:id', component: CourseCardComponent },
  { path: 'quizzes', component: QuizzesComponent },
  { path: 'quiz/:id', component: QuizCardComponent }, 
  { path: 'results', component: ResultsComponent },  
  { path: 'contact', component: ContactComponent },
  { path: '', redirectTo: '/courses', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }