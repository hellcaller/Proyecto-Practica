import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse, } from '@angular/common/http';
import { Observable } from 'rxjs';

import { User } from '../models/user';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  selectedUser: User;

  URLBase = environment.apiURL;
  baseURLCreateUser = environment.apiURL + 'user_create';
  constructor(private httpClient: HttpClient) {
    this.selectedUser = new User();
  }

  login(login: any): Observable<any> {
    let json = JSON.stringify(login);
    let headers = new HttpHeaders().set('Content-Type', 'application/json');
    return this.httpClient.post(this.URLBase + 'singIn', json, { headers: headers })
  }

  firstLoguin(token: String){
    let json = {
      token: token
    }
    let headers = new HttpHeaders().set('Content-Type', 'application/json');
    return this.httpClient.post(this.URLBase + 'firstLogin', json, { headers: headers })
  }

  postUser(user: User) {
    return this.httpClient.post(this.baseURLCreateUser, user);
  }

  resetPass(pass: String){
    return this.httpClient.post(this.URLBase + 'cambiar_pass', pass)
  }
}
