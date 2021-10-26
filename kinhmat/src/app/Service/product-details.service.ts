import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ProductDetailsService {

  constructor(private http:HttpClient) { }

  URL = "http://localhost:8080/product/";

  getAll(){
    return this.http.get<any>(this.URL);
  }

}

