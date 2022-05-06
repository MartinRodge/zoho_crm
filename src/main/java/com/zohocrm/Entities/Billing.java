package com.zohocrm.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="bills")
public class Billing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@Column(name= "First_name", nullable = false, length= 45)
		private String firstName;

		@Column(name= "last_name", nullable = false, length= 45)
		private String lastName;
		
		@Column(name= "email", nullable = false, length= 128)
		private String email;
		


		
		private String productName;
		private int amountPaid;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getAmountPaid() {
			return amountPaid;
		}
		public void setAmountPaid(int amountPaid) {
			this.amountPaid = amountPaid;
		}
}
