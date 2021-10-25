import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {UserModule} from "./user/user.module";
import {AngularFireStorageModule} from "@angular/fire/compat/storage";
import {environment} from "../environments/environment";
import {AngularFireModule} from "@angular/fire/compat";
import {FirebaseImageComponent} from './firebase-image/firebase-image.component';
import {HomeComponent} from "./user/home/home.component";
import {ScrollingModule} from "@angular/cdk/scrolling";
import {NgxImgZoomModule} from "ngx-img-zoom";
import {NgxImageZoomModule} from "ngx-image-zoom";
import { LoginComponent } from './login/login.component';
// import {MatSidenavMenuComponent} from "mat-sidenav-menu";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FirebaseImageComponent,
    LoginComponent,
    // MatSidenavMenuComponent,
  ],
  imports: [
    // MatSidenavMenuModule,
    NgxImageZoomModule,
    ScrollingModule,
    NgxImgZoomModule,
    BrowserModule,
    AppRoutingModule,
    UserModule,
    AngularFireStorageModule,
    AngularFireModule.initializeApp(environment.firebaseConfig, 'cloud')
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
