import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiService } from '../../../services/api.service';

@Component({
  selector: 'app-quiz-card',
  templateUrl: './quiz-card.component.html',
  styleUrls: ['./quiz-card.component.css']
})
export class QuizCardComponent implements OnInit {
  quiz: any = null;
  currentQuestionIndex: number = 0;
  selectedAnswer: string = '';
  selectedAnswers: { [key: number]: string } = {}; 
  score: number = 0;
  loading: boolean = true;
  questionsAttended: number = 0; 
  answeredQuestions: Set<number> = new Set<number>();

  constructor(private route: ActivatedRoute, private apiService: ApiService, private router: Router) {}

  ngOnInit(): void {
    const quizId = Number(this.route.snapshot.paramMap.get('id'));  
    if (!quizId) {
      console.error("Invalid quiz ID");
      return;
    }

    this.apiService.getQuizById(quizId).subscribe({
      next: (data) => {
        this.quiz = data;
        if (!this.quiz.attempt) {
          this.quiz.attempt = 0; 
        }
        this.incrementAttempt();
        this.loading = false;
      },
      error: (err) => {
        console.error("Error fetching quiz:", err);
        this.loading = false;
      }
    });
  }

  incrementAttempt(): void {
    this.quiz.attempt += 1;
    this.apiService.updateQuiz(this.quiz).subscribe({
      next: (updatedQuiz) => {
        console.log("Quiz attempt incremented:", updatedQuiz);
      },
      error: (err) => {
        console.error("Error updating quiz attempt:", err);
      }
    });
  }

  nextQuestion() {
    if (this.selectedAnswer) {
      this.selectedAnswers[this.currentQuestionIndex] = this.selectedAnswer;
    }
  
    if (!this.answeredQuestions.has(this.currentQuestionIndex) && this.selectedAnswer) {
      this.answeredQuestions.add(this.currentQuestionIndex);
      this.questionsAttended++; 
      if (this.selectedAnswer === this.quiz.questions[this.currentQuestionIndex].answer) {
        this.score++;
      }
    }
  
    this.selectedAnswer = ''; 
  
    if (this.currentQuestionIndex < this.quiz.questions.length - 1) {
      this.currentQuestionIndex++;
      this.selectedAnswer = this.selectedAnswers[this.currentQuestionIndex] || '';
    } else {
      this.submitQuiz(); 
    }
  }  

  previousQuestion() {
    if (this.selectedAnswer) {
      this.selectedAnswers[this.currentQuestionIndex] = this.selectedAnswer;
    }

    if (this.currentQuestionIndex > 0) {
      this.currentQuestionIndex--;
      this.selectedAnswer = this.selectedAnswers[this.currentQuestionIndex] || '';
    }
  }

  submitQuiz() {
    if (this.selectedAnswer) {
      this.selectedAnswers[this.currentQuestionIndex] = this.selectedAnswer;
    }
  
    if (!this.answeredQuestions.has(this.currentQuestionIndex) && this.selectedAnswer) {
      this.answeredQuestions.add(this.currentQuestionIndex);
      this.questionsAttended++; 
      if (this.selectedAnswer === this.quiz.questions[this.currentQuestionIndex].answer) {
        this.score++;
      }
    }
  
    const result = {
      quizId: this.quiz.id,
      quizName: this.quiz.name, 
      score: this.score,
      totalQuestions: this.quiz.questions.length,
      date: new Date(),
      attempt: this.quiz.attempt,
      questionsAttended: this.questionsAttended,
    };
    console.log("Submitting result:", result);
    this.apiService.addResult(result).subscribe({
      next: () => {
        this.router.navigate(['/results']);
      },
      error: (err) => {
        console.error("Error submitting result:", err);
      }
    });
  }

  goBack() {
    this.router.navigate(['/quizzes']);
  }
  
}  
