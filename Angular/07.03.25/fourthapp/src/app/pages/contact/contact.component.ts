import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {
  contactForm: FormGroup;

  constructor(private fb: FormBuilder, private apiService: ApiService) { 
    this.contactForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      message: ['', Validators.required]
    });
  }

  ngOnInit(): void {}

  onSubmit(): void {
    if (this.contactForm.valid) {
      this.apiService.submitMessage(this.contactForm.value).subscribe(
        response => {
          alert('Message submitted successfully.');
          console.log('Form submitted', response);
          this.contactForm.reset(); 
        },
        error => {
          console.error('Error submitting message', error);
          alert('An error occurred while submitting your message.');
        }
      );
    }
  }
}
