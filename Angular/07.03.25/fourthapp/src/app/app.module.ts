import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { CoursesComponent } from './pages/courses/courses.component';
import { CourseCardComponent } from './pages/courses/course-card/course-card.component';
import { QuizzesComponent } from './pages/quizzes/quizzes.component';
import { QuizCardComponent } from './pages/quizzes/quiz-card/quiz-card.component';
import { ResultsComponent } from './pages/results/results.component';
import { HttpClientModule } from '@angular/common/http';
import { LevelFilterPipe } from './pipes/level-filter.pipe';
import { DurationFilterPipe } from './pipes/duration-filter.pipe';
import { FormsModule } from '@angular/forms';
import { ContactComponent } from './pages/contact/contact.component';
import { ReactiveFormsModule } from '@angular/forms'


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CoursesComponent,
    QuizzesComponent,
    QuizCardComponent,
    ResultsComponent,
    LevelFilterPipe,
    DurationFilterPipe,
    CourseCardComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule{ }
