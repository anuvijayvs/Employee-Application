package com.src.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;

		@Column(name = "street1")
		private String street1;
		
		@Column(name = "street2")
		private String street2;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "state")
		private String state;
}
