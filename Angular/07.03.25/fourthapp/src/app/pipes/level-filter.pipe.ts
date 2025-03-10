import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'levelFilter'
})
export class LevelFilterPipe implements PipeTransform {
  transform(courses: any[], selectedLevel: string): any[] {
    if (!courses || !selectedLevel || selectedLevel === 'all') {
      return courses;
    }
    return courses.filter(course => course.level === selectedLevel);
  }
}
