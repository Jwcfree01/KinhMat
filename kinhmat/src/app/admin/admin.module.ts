import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeAdminComponent } from './home-admin/home-admin.component';
import {UserModule} from "../user/user.module";



@NgModule({
  declarations: [
    HomeAdminComponent,
    HomeAdminComponent
  ],
  imports: [
    CommonModule,
    UserModule
  ]
})
export class AdminModule { }
