package com.springrestapi.springrestapi.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
public class Users {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(min = 3,message = "min character should be 3")
	@Pattern(regexp="[a-z]{3,12}", message = "First Name must not contains numbers or special characters")
	private String firstname;
	
	
	@NotNull
	@Size(min = 3,message = "min character should be 3")
	@Pattern(regexp="[a-z]{3,12}", message = "Last Name must not contains numbers or special characters")
	private String lastname;
	
	
	@NotNull
	@Size(min = 6,message = "min character should be 3")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
	private String email;
	
	@NotNull
//	@Pattern(regexp="[0-9]{10}", message = "Mobile number must have 10 digits")
	private long mobile;
	
	

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Users(long id,
			@NotNull @Size(min = 3, message = "min character should be 3") @Pattern(regexp = "[a-z]{3,12}", message = "First Name must not contains numbers or special characters") String firstname,
			@NotNull @Size(min = 3, message = "min character should be 3") @Pattern(regexp = "[a-z]{3,12}", message = "Last Name must not contains numbers or special characters") String lastname,
			@NotNull @Size(min = 6, message = "min character should be 3") @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$") String email,
			@NotNull @Pattern(regexp = "[0-9]{10}", message = "Mobile number must have 10 digits") long mobile) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
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



	@Override
	public String toString() {
		return "Users [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}

		

}
