package com.MallNearMe.pojo;

public class ContactUs {
	
	public int contactid;
	public String contactname;
	public String contactemail;
	public String contactcno;
	public String contactmessage;
	
	
	public ContactUs() {
		// TODO Auto-generated constructor stub
	}


	public ContactUs(String contactname, String contactemail, String contactcno, String contactmessage) {
		super();
		this.contactname = contactname;
		this.contactemail = contactemail;
		this.contactcno = contactcno;
		this.contactmessage = contactmessage;
	}


	public ContactUs(int contactid, String contactname, String contactemail, String contactcno, String contactmessage) {
		super();
		this.contactid = contactid;
		this.contactname = contactname;
		this.contactemail = contactemail;
		this.contactcno = contactcno;
		this.contactmessage = contactmessage;
	}


	public int getContactid() {
		return contactid;
	}


	public void setContactid(int contactid) {
		this.contactid = contactid;
	}


	public String getContactname() {
		return contactname;
	}


	public void setContactname(String contactname) {
		this.contactname = contactname;
	}


	public String getContactemail() {
		return contactemail;
	}


	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}


	public String getContactcno() {
		return contactcno;
	}


	public void setContactcno(String contactcno) {
		this.contactcno = contactcno;
	}


	public String getContactmessage() {
		return contactmessage;
	}


	public void setContactmessage(String contactmessage) {
		this.contactmessage = contactmessage;
	}


	@Override
	public String toString() {
		return "ContactUs [contactid=" + contactid + ", contactname=" + contactname + ", contactemail=" + contactemail
				+ ", contactcno=" + contactcno + ", contactmessage=" + contactmessage + "]";
	}
	
	
}
