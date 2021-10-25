import { Component, OnInit } from '@angular/core';
import {APIService} from "../api.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: any;
  pass:any;

  constructor(private service:APIService) { }

  ngOnInit(): void {
  }

  login() {
    if (this.username == 'thong' || this.pass == '123'){
      this.service.activate()
      console.log("activate")
    }else {
      console.log("loi")
    }
  }
}
