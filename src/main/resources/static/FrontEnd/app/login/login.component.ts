import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user = '';
  constructor() { }

  ngOnInit() {
  }

  setAsTeacher() {
    this.user = 'teacher';
  }
  setAsStudent() {
    this.user = 'student';
  }

}
