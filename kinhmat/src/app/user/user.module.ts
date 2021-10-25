import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {ProductDetailsComponent} from './product-details/product-details.component';
import {NgxImgZoomModule} from "ngx-img-zoom";
import {ProductComponent} from './product/product.component';
import {ContactComponent} from './contact/contact.component';
import {NewsComponent} from './news/news.component';
import {IntroduceComponent} from './introduce/introduce.component';
import {NgxImageZoomModule} from "ngx-image-zoom";
import {Router, RouterModule} from "@angular/router";
import {DoKhucXaComponent} from './do-khuc-xa/do-khuc-xa.component';
import {SidebarModule} from "ng-sidebar";

@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent,
    ProductDetailsComponent,
    ProductComponent,
    ContactComponent,
    NewsComponent,
    IntroduceComponent,
    DoKhucXaComponent,
  ],
  exports: [
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    NgxImgZoomModule,
    NgxImageZoomModule,
    RouterModule,
    // SidebarModule
  ]
})
export class UserModule {
}
