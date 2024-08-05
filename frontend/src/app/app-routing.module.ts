import { HttpClientModule, HTTP_INTERCEPTORS } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RouterModule, Routes } from "@angular/router";
//import {TestingComponent} from "../app/testing/testing.component";
import { AppComponent } from "./app.component";
import { AuthInterceptor } from "./auth.interceptors";


const routes: Routes = [
  {
    path: "auth",
    loadChildren: () => import("./auth/auth.module").then((m) => m.AuthModule),
  },

  {
    path: "bank",
    loadChildren: () => import("./bank/bank.module").then((m) => m.BankModule),
  },
  {
    path: "",
    pathMatch: "full",
    redirectTo: "/auth",
  },
  // {
  //   path:'testing',
  //   component:TestingComponent
  // }
];

@NgModule({
  declarations:[AppComponent],
  imports: [RouterModule.forRoot(routes),BrowserModule,HttpClientModule],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true,
    },
  ],
  exports: [RouterModule],
  bootstrap:[AppComponent]
})
export class AppRoutingModule {}
