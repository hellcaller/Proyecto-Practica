import { Component, OnInit } from '@angular/core';
import { interval } from 'rxjs';
import { QuestionService } from '../../services/question.service';
import { Questions2Service } from '../../services/questions2.service';



@Component({
  selector: 'app-question',
  templateUrl: './questions2.component.html',
  styleUrls: ['./questions2.component.scss']
})
export class Question2Component implements OnInit {

  public name: string = "";
  public questionList: any = [];
  public currentQuestion: number = 0;
  public points: number = 0;
  counter: number = 60;
  correctAnswer: number = 0;
  wrongAnswer: number = 0;
  interval$: any;
  progress: string = "0";
  isQuizCompleted: boolean = false;
  inteligenciaMatematica:"tienes inteligencia matematica";
  resul: boolean =false;

  constructor(private Questions2Service : Questions2Service) { }

  ngOnInit(): void {
    this.name = localStorage.getItem("name")!;
    this.getAllQuestions();
    this.startCounter();
  }

  getAllQuestions() {
    this.Questions2Service.getQuestionJson()
      .subscribe(res => {
        this.questionList = res.questions;
      })
  }

  nextQuestion() {
    //if (this.currentQuestion < this.questionList.length - 1) {
    this.currentQuestion++;
    //}
  }

  previousQuestion() {
    //if (this.currentQuestion > 0) {
    this.currentQuestion--;
    //}
  }

  answer(currentQno: number, option: any) {

    if (currentQno == this.questionList.length) {
      this.isQuizCompleted = true;
      this.stopCounter();
    }
    if (option.correct) {
      this.points++;
      this.correctAnswer++;
      setTimeout(() => {
        if (this.currentQuestion < this.questionList.length - 1) {
          this.currentQuestion++;
        }
        this.resetCounter();
        this.getProgressPercentage();
      }, 1000);
    } else {
      setTimeout(() => {
        if (this.currentQuestion < this.questionList.length - 1) {
          this.currentQuestion++;
        }
        this.wrongAnswer++;
        this.resetCounter();
        this.getProgressPercentage();
      }, 1000);
    }
  }

  startCounter() {
    this.interval$ = interval(1000)
      .subscribe(val => {
        this.counter--;
        if (this.counter == 0) {
          this.currentQuestion++;
          this.counter = 60;
        }
      });
    setTimeout(() => {
      this.interval$.unsubscribe();
    }, 600000);
  }

  stopCounter() {
    this.interval$.unsubscribe();
    this.counter = 0;
  }

  resetCounter() {
    this.stopCounter();
    this.counter = 60;
    this.startCounter();
  }

  resetQuiz() {
    this.resetCounter();
    this.getAllQuestions();
    this.points = 0;
    this.counter = 60;
    this.currentQuestion = 0;
    this.progress = "0";
  }

  getProgressPercentage() {
    this.progress = ((this.currentQuestion / this.questionList.length) * 100).toString();
    return this.progress;
  }

  resultadoDif()
  {
    if( this.correctAnswer > 3)
    {
      this.resul = true;
      console.log("mi perro es re inteligente");
    }
    else
    {

      this.resul = false;
      inteligenciaMatematica:"Inteligencia matematica";
    }
  }

}
