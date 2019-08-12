import { BrowserModule } from '@angular/platform-browser';

import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';


import { CPDefaultThemeDirective }  from './app.component.dr';
import { CPMyThemeDirective } from './app.mycomponent.dr';



@NgModule({
  
declarations: [
    AppComponent, CPDefaultThemeDirective ,CPMyThemeDirective
  ],
  
imports: [
    BrowserModule
  ],
  
providers: [],
  
bootstrap: [AppComponent]
})


export class AppModule { }
