package com.example.demo.models;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min=3, message="Username must have atleast 3 characters")
	@NotNull(message="Username is required")//validation - front end to server side
//	@Column(nullable=false) //db column = not null constraint //server to db
	private String username;
	
	@Email(message="Please enter valid email")
	@NotNull(message="Email is required")
	private String email;
	@NotNull(message="Password is required")
	@Pattern(regexp = "[a-zA-z0-9@#_]*", message="Password must include ONLY alphabets,digits and special symbols")
	@Size(min=6, max=15, message = "password must have 6-15 characters")
	private String password;
	@Pattern(regexp = "[0-9]*", message="mbile must contain digits only")
	@NotNull
	@Size(min=10,max=10, message="mobile must have exactly 10 digits")
	private String mobile;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
