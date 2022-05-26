import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class Questions2Service {

  constructor(private http: HttpClient) { }

  getQuestionJson() {
    return this.http.get<any>("assets/questions2.json");
  }

}
