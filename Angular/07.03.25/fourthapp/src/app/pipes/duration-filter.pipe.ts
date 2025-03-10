import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'durationFilter'
})
export class DurationFilterPipe implements PipeTransform {
  transform(courses: any[], selectedDuration: string): any[] {
    if (!courses || !selectedDuration || selectedDuration === 'all') {
      return courses;
    }
    return courses.filter(course => course.duration === selectedDuration);
  }
}
