import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./user/home/home.component";
import {ProductDetailsComponent} from "./user/product-details/product-details.component";
import {ProductComponent} from "./user/product/product.component";
import {DoKhucXaComponent} from "./user/do-khuc-xa/do-khuc-xa.component";
import {IntroduceComponent} from "./user/introduce/introduce.component";
import {NewsComponent} from "./user/news/news.component";
import {ContactComponent} from "./user/contact/contact.component";
import {HomeAdminComponent} from "./admin/home-admin/home-admin.component";
import {GuardAdminGuard} from "./guard-admin.guard";
import {LoginComponent} from "./login/login.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'kinh-tre-em', component: ProductComponent},
  {path: 'kinh-thoi-trang', component: ProductComponent},
  {path: 'gong kinh', component: ProductComponent},
  {path: 'trong-kinh', component: ProductComponent},
  {path: 'gong kinh', component: ProductComponent},
  {path: 'do-khuc-xa', component: DoKhucXaComponent},
  {path: 'tranh-theu', component: ProductComponent},
  {path: 'tranh-dinh-da', component: ProductComponent},
  {path: 'tranh-ve', component: ProductComponent},
  {path: 'gioi-thieu', component: IntroduceComponent},
  {path: 'tin-tuc', component: NewsComponent},
  {path: 'lien-he', component: ContactComponent},
  {path: 'details/1', component: ProductDetailsComponent},
  {path: 'trang-nguoi-ban', component: LoginComponent, canActivate:[GuardAdminGuard]},

  {path: '**', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
