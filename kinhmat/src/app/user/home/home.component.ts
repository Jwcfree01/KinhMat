import {Component, OnInit} from '@angular/core';
import {IProductDetails} from "../../Interface/IProductDetails";
import {ProductDetailsService} from "../../Service/product-details.service";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

productDetails!: IProductDetails[];

  constructor(private service: ProductDetailsService) {
  }

  ngOnInit(): void {
    this.getAllProductDetails();
  }

  getAllProductDetails(){
    this.service.getAll().subscribe(data =>{
      this.productDetails = data.content;
      console.log(data)
    })
  }

}
