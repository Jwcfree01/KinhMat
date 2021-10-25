import { Injectable } from '@angular/core';
import {GuardAdminGuard} from "./guard-admin.guard";

@Injectable({
  providedIn: 'root'
})
export class APIService {

  constructor(private authentication:GuardAdminGuard) { }

    abc!:boolean;

  activate(){
    // @ts-ignore
    return this.authentication.canActivate();
  }
}
