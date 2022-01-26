package net.javaguides.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data 
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id ")
	private long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	 
	@JsonManagedReference

	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	
//	public Employee(String firstName, String lastName, Address address) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.address.setEmployee(this);
//    }
}
