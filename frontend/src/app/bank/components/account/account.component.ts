// // src/app/accounts/accounts.component.ts
// import { Component, OnInit } from '@angular/core';
// import { AccountTS } from '../../types/tstypes/Accountts';
// import { FormBuilder, FormGroup, Validators } from '@angular/forms';

// @Component({
//   selector: 'app-accounts',
//   templateUrl: './account.component.html',
//   styleUrls: ['./account.component.css']
// })
// export class AccountComponent implements OnInit {
// onSubmit() {
// throw new Error('Method not implemented.');
// }
//   accountForm!: FormGroup;
//   account: AccountTS | undefined;
//   // accountForm: any;
//   formBuilder!: FormBuilder;
//   validateAccountId: any;
//   validateNonNegativeAmount: any;
//   // account: Account;

//   constructor(private fb: FormBuilder) {}

//   ngOnInit(): void {
//     // No need to fetch data from a service since we are using hardcoded data
//     this.accountForm = this.fb.group({
//       account_id: ["", [Validators.required]],
//       customer_id: ["", [Validators.required]],
//       balance: ["", [Validators.required]],
//     });
//     this.account = new AccountTS("1" ,1000.00,"1");

//   }
// }



// src/app/accounts/accounts.component.ts
import { Component, OnInit } from '@angular/core';
// import { Account } from '../../types/Account';
import { AccountTS } from '../../types/tstypes/Accountts';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-accounts',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {
onSubmit() {
throw new Error('Method not implemented.');
}
  accountForm!: FormGroup;
  account: AccountTS | undefined;


  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    // No need to fetch data from a service since we are using hardcoded data
    this.accountForm = this.fb.group({
      account_id: [null, [Validators.required, this.validateAccountId]],
      customer_id: [null, Validators.required],
      balance: [null, [Validators.required, this.validateNonNegativeAmount]],
    });
    this.account = new AccountTS("1", 1000.00,"1");

  }
  validateAccountId(control:FormControl) {
    const accountId = control.value;
    return accountId === null ? { accountIdRequired: true } : null;
  }

  validateNonNegativeAmount(control:FormControl) {
    const amount = control.value;
    return amount < 0 ? { nonNegativeAmount: true } : null;
  }

  validateCustomerName(control:FormControl) {
    const customerName = control.value;
    const specialCharacterPattern = /[!@#$%^&*(),.?":{}|<>]/;
    return specialCharacterPattern.test(customerName) ? { containsSpecialCharacters: true } : null;
  }
}

