import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private apiUrl = 'http://localhost:4500/'; 

  constructor(private http: HttpClient) {}

  getCourses(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}courses`);
  }

  getCourseById(id: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}courses/${id}`);
  }  

  getQuizzes(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}quizzes`);
  }

  getQuizById(id: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}quizzes/${id}`);
  }
  
  getResults(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}results`);
  }

  addResult(result: any): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}results`, result);
  }

  updateQuiz(quiz: any): Observable<any> {
    return this.http.put<any>(`${this.apiUrl}quizzes/${quiz.id}`, quiz);
  }

  submitMessage(messageData: any): Observable<any> {
    return this.http.post(`${this.apiUrl}messages`, messageData); 
  }
  
}
