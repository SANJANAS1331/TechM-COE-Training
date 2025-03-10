import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {
  courses: any[] = [];
  selectedLevel: string = 'all';
  selectedDuration: string = 'all';
  selectedCourse: any = null; 

  constructor(private apiService: ApiService) {}

  ngOnInit(): void {
    this.apiService.getCourses().subscribe((data: any[]) => {  
      this.courses = data;
    });
  }

  viewCourse(course: any) {
    this.selectedCourse = course;
    window.scrollTo({ top: 0, behavior: 'smooth' });
  }

  goBack() {
    this.selectedCourse = null; 
  }
}
