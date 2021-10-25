import {Component, HostBinding, HostListener, OnInit} from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor() {
  }

  ngOnInit(): void {
  }

  //scroll change color menu
  abc() {
    // console.log(window.scrollY.toString());
    // console.log("a")
  }

  @HostListener('window:scroll', ['$event'])
  onScroll(event: any) {
    // console.log(window.scrollY)
    let header = document.getElementById("abc");
    let menuList = document.getElementsByClassName("menu-list");
    if (window.scrollY > 150) {
      // @ts-ignore
      header.style.backgroundColor = "#24272b";
      // @ts-ignore
      header.style.transition = "1s";
      // @ts-ignore
      menuList.style.color = "#353535";
    } else {
      // @ts-ignore
      header.style.backgroundColor = "white";
      // @ts-ignore
      header.style.transition = "1s";
      // @ts-ignore
      header.menuList.style.color = "#fff791";
    }
  }

}
