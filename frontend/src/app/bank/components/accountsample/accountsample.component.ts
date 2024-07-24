import { Component } from '@angular/core';
import { AccountTS } from '../../types/tstypes/Accountts';
import { AccountComponent } from '../account/account.component';

@Component({
  selector: 'app-accountsample',
  standalone: true,
  imports: [],
  templateUrl: './accountsample.component.html',
  styleUrls: ['./accountsample.component.css']
})
export class AccountsampleComponent {
  account: AccountTS;
 
  constructor(){
    this.account = new AccountTS("1", 1000.00, "1");
  }
  // account : any = AccountTS;
  // constructor(){
  //  this.account 

  // }
}
