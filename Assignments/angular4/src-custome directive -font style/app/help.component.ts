import { Component } from '@angular/core';

@Component({
    selector: 'app-help',
    template: `<h2>Help</h2>
    <!-- a [routerLink]="['/help']">Help</a -->
    <a [routerLink]="['/help/user']">HelpUser</a>
    <a [routerLink]="['/help/admin']">HelpAdmin</a>
    <div>
    <router-outlet></router-outlet>
    </div>
    `
  })
  export class HelpComponent { }