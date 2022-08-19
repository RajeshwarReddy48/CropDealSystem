package com.systemadmin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DealersDetails")
public class DealersDetails {
	
	@Id
	private String userName;
	//private String dealerId;
	private String emailId;
	private String mobileNumber;
	
	public DealersDetails() {
		super();
	}
	
	public DealersDetails(String userName, String emailId, String mobileNumber) {
		super();
		this.userName = userName;
		//this.dealerId=dealerId;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/*
	 * public String getDealerId() { return dealerId; }
	 * 
	 * public void setDealerId(String dealerId) { this.dealerId = dealerId; }
	 */
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
