import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { BankService } from '../../services/bank.service';
import { Observable, of } from 'rxjs';
import { Account } from '../../types/Account';
import { Customer } from '../../types/Customer';
 
@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.scss']
})
export class AccountComponent implements OnInit {
  customers$: Observable<Customer[]>;
  accountForm: FormGroup;
  accounts$: Observable<Account[]>;
  accountError$: Observable<string>;
  accountSuccess$: Observable<string>;
  isFormSubmitted: boolean = false;
  bankService: BankService;
  role:string|null;
  userId:string|null;
  constructor(
    private formBuilder: FormBuilder,
    private banksService: BankService
  ) {
 
    this.customers$ = this.banksService.getCustomers();
   
  }
 
  ngOnInit(): void {
    this.accountForm = this.formBuilder.group({
      customer: ["", [Validators.required]],
      balance: ["", [Validators.required]],
    });
   
  }
 
  onSubmit() {
    this.isFormSubmitted = true;
    this.accountSuccess$ = of('');
    this.accountError$ = of('');
    if (this.accountForm.invalid) {
      return;
    } else {
      const formData= this.accountForm.value;
      console.log(formData);
      const account = new Account(formData);
      this.banksService.addAccount(account).subscribe(
        (res: any) => {
          this.accountSuccess$ = of("Account created successfully");
        },
        (error) => {
          this.accountError$ = of("Unable to create account");
        }
      );
    }
  }
 
}