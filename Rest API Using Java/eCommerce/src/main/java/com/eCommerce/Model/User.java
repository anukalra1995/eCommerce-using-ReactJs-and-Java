package com.eCommerce.Model;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fname")
	@NotNull
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "email")
	@Email
	private String email;
	
	@Column(name = "pwd")
	@NotEmpty
	private String pwd;
	
	@Column(name = "roles")
	private String role;
	
	
	public User() {
		super();
	}

	public User(long id, String fname, String lname, String email, String pwd, String role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pwd=" + pwd
				+ ", role=" + role + "]";
	}
	
	
}
