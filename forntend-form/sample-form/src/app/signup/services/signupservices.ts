import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Signup } from '../model/signup';

@Injectable()
export class SignupServices{
  addSignup(signup: Signup): Observable<Signup> {
    throw new Error('Method not implemented.');
  }
    fetchSignupByUsername(firstname:any, lastname:any, emailId:any,username: any, password: any): Observable<Signup[]> {
        throw new Error('Method not implemented.');
      }

      baseUrl="http://localhost:8585/signups"

      constructor(private http:HttpClient){

    }

    adSignup(signup:Signup):Observable<Signup>{
        const url=this.baseUrl+"/add";
        console.log("inside at freelancer" + "firstname = " + signup.firstname+ "lastname = "+ signup.lastname + "password = " + signup.emailId+ "emailId = " + signup.username +"username = " + signup.password)
        let requestData={firstname:signup.firstname,lastname:signup.lastname,emailId:signup.emailId,username:signup.username,password:signup.password};
        let observable:Observable<Signup>=this.http.post<Signup>(url,requestData);
        return observable;
       }
   
}