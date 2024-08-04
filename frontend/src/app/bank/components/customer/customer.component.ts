
import { Component, OnInit } from '@angular/core';
// import { Customer } from '../../types/Customer'; 
import { CustomerTS } from '../../types/tstypes/Customerts';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';
import { of } from 'rxjs';

@Component({
  selector: 'app-customers',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css'],
})
export class CustomersComponent implements OnInit {
  isFormSubmitted: boolean | undefined;
  customerSuccess$: any;
  customerError$: any;
onSubmit() {
  this.isFormSubmitted = true;
    this.customerSuccess$ = of('');
    this.customerError$ = of('');
    throw new Error('Method not implemented.');
    //this.register();
  }
   customerForm!: FormGroup;

   customers: CustomerTS[] =[ 
    new CustomerTS("John Doe", "john@example.com", "john_doe", "password123", "User", "1"),
    new CustomerTS("John Doe1", "john1@example.com", "john_doe1", "password1234", "User1", "2")
   ]
    
    
  constructor( private formBuilder: FormBuilder) {
  }

  ngOnInit():void {
    // this.loadCustomers();
    this.customerForm = this.formBuilder.group({
      name: ["", Validators.required],
      email: ["", Validators.required],
      username: ["", Validators.required],
      password: ["", Validators.required]
    });
  }
  register():boolean {
   
    const { name, email, username, password } =this.customerForm.value;
    // Frontend validation for registration form
    if (name === "" || email === "" || username === "" || password === "") {
      this.customerError$= of("All fields are mandatory. Please fill in all the details.");
        return false;
    }

    // Validate email format
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        this.customerError$=of("Please enter a valid email address.");
        return false;
    }

    // Validate username (no special characters)
    var usernameRegex = /^[a-zA-Z0-9]+$/;
    if (!usernameRegex.test(username)) {
        this.customerError$=of("Username should not contain special characters.");
        return false;
    }

    // Validate password (at least 8 characters, one capital letter, and one numeric)
    var passwordRegex = /^(?=.*[A-Z])(?=.*\d).{8,}$/;
    if (!passwordRegex.test(password)) {
        this.customerError$=of("Password should be at least 8 characters and must contain at least one capital letter and one numeric.");
        return false;
    }

    // You can proceed with registration if all validations pass
    this.customerSuccess$=of("Register clicked. Name: " + name + ", Email: " + email + ", Username: " + username + ", Password: " + password);
    return true;
}
  
  
}
