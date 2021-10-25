import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-home-admin',
  templateUrl: './home-admin.component.html',
  styleUrls: ['./home-admin.component.css']
})
export class HomeAdminComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  openNav() {
    let a = document.getElementById("mySidenav")
    // @ts-ignore
    a.style.width = "250px";
  }

  closeNav() {
    let b = document.getElementById("mySidenav")
    // @ts-ignore
    b.style.width = "0";
  }
}
