import { Component } from '@angular/core';
// import { Customer } from '../bank/types/Customer';
import { CustomerTS } from '../../types/tstypes/Customerts';

@Component({
  selector: 'app-customerarray',

  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {
  customers: CustomerTS[] = [
    new CustomerTS("John Doe", "john@example.com", "john_doe", "password123", "User", "1"),
    new CustomerTS("John Doe1", "john1@example.com", "john_doe", "password123", "Admin", "2")
   ]
}