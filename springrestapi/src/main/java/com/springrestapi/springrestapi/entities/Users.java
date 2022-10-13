package com.springrestapi.springrestapi.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Users {
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(min = 3,message = "min character should be 3")
	private String firstname;
	
	
	@NotNull
	@Size(min = 3,message = "min character should be 3")
	private String lastname;
	
	@NotNull
	private String email;
	
	@NotNull
	private long mobile;
	
	@NotNull
	@Size(min = 5,message = "min character should be 5")
	private String Designation;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(long id, @NotNull @Size(min = 3, message = "min character should be 3") String firstname,
			@NotNull @Size(min = 3, message = "min character should be 3") String lastname, @NotNull String email,
			@NotNull long mobile, @NotNull @Size(min = 5, message = "min character should be 5") String designation) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		Designation = designation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobile=" + mobile + ", Designation=" + Designation + "]";
	}

	
	

}