import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-course-card',
  templateUrl: './course-card.component.html',
  styleUrls: ['./course-card.component.css']
})
export class CourseCardComponent {
  @Input() course: any;
  @Output() back = new EventEmitter<void>(); 

  goBack() {
    this.back.emit(); 
  }

  getContentClass(content: string): string {
    if (content.startsWith('Module')) {
      return 'module-heading'; 
    } else if (content.startsWith('Lesson')) {
      return 'lesson-heading'; 
    } else if (content.startsWith('Final Project')) {
      return 'final-project'; 
    }
    return 'normal-content'; 
  }
  
}
