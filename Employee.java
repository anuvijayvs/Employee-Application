package com.src.employee.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
            private Long id;
        
        @Column(name="name")
        private String name;
        
        @Column(name="gender")
        private String gender;
        
        @Column(name="contact")
        private String contact;
        
        @OneToMany(mappedBy = "employee")
        private List<Address> address;
        

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public List<Address> getAddress() {
			return address;
		}

		public void setAddress(List<Address> address) {
			this.address = address;
		}
}
