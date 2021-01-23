import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Signup } from './model/signup';
import { SignupServices } from './services/signupservices';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  signup:Signup | undefined

  constructor(private signupServices:SignupServices) { }

  ngOnInit(): void {
  }

  addSignup(myform:any){
    let data=myform.value;
    this.signup=new Signup(0,data.firstname,data.lastname,data.emailId,data.username,data.password);
    let observable:Observable<Signup>=this.signupServices.addSignup(this.signup);
    observable.subscribe(
      (signup:Signup)=>this.signup=signup,
      err=>console.log("err is "+err.message)

    );
    console.log("received="+data.firstname+" "+data.lastname+" "+data.emailId+" " +data.username+" " +data.password);       
    myform.reset();// clear form
  }

}
