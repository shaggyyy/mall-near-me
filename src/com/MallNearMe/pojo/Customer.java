package com.MallNearMe.pojo;

public class Customer {
	
	public int cid;
	public String cname;
	public String cuname;
	public String cpassword;
	public String role;
	public String contact;
	public String email;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCuname() {
		return cuname;
	}
	public void setCuname(String cuname) {
		this.cuname = cuname;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Customer(String cname, String cuname, String cpassword, String role, String contact, String email) {
		super();
		this.cname = cname;
		this.cuname = cuname;
		this.cpassword = cpassword;
		this.role = role;
		this.contact = contact;
		this.email = email;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cuname=" + cuname + ", cpassword=" + cpassword
				+ ", role=" + role + ", contact=" + contact + ", email=" + email + "]";
	}
	
	
	
	
}
