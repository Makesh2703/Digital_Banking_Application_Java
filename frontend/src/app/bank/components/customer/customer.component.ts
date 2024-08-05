import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Observable, of } from 'rxjs';
import { Customer } from '../../types/Customer';
import { BankService } from '../../services/bank.service';
import { AuthService } from 'src/app/auth/services/auth.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customerForm: FormGroup;
  customerError$: Observable<string>;
  customerSuccess$: Observable<string>;
  isFormSubmitted: boolean = false;

  constructor(
    private formBuilder: FormBuilder,
    private banksService: BankService,
    private   authService: AuthService
  ) {}

  ngOnInit(): void {
    this.customerForm = this.formBuilder.group({
      name: ["", [Validators.required]],
      email: ["", [Validators.required]],
      username: ["", [Validators.required]],
      password: ["", [Validators.required]],
      role:["",[Validators.required]]
    });
  }
  hasSpecialCharacters(inputString:string):boolean {
    // Define a regular expression for special characters
    const specialCharactersRegex = /[!@#$%^&*()_+{}\[\]:;<>,.?~\\/-]/;
  
    // Test if the inputString contains any special characters
    return specialCharactersRegex.test(inputString);
  }
  onSubmit() {
    this.isFormSubmitted = true;
    this.customerSuccess$ = of('');
    this.customerError$ = of('');
    const emailRegex: RegExp = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (this.customerForm.invalid) {
      return;
    } else {
      
      const data= this.customerForm.value;
      if(data.password.length < 8)
      {
        this.customerError$ = of("Password must be of 8 characters");
        return;
      }
      if(this.hasSpecialCharacters(data.username))
      {
        this.customerError$ = of("User Name must consist of letter and number only!!");
        return;
      }
      console.log(emailRegex.test(data.email));
      if(!emailRegex.test(data.email))
      {
        this.customerError$ = of("Invalid Email Id!!");
        return;

      }
      // const username = name, password = "abcd1234";
      const customer: Customer = 
       new Customer(data);
      
      ;
      this.authService.createUser(customer).subscribe(
        (res: any) => {
          this.customerSuccess$ = of('Customer created successfully');
        },
        (error) => {
          this.customerError$ = of("Unable to create customer");
        }
      );
    }
  }
 
}