package com.controller.dealerservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document("farmer")
public class Farmer {
	
	@Id
	private String fid;
	@Field
	private String femail;
	@Field
	private String fpass;
	@Field
	private String fname;
	@Field
	private String fcontact;
	@Field
	private  String flocation;
	@Field
	private  String fabout;
	@Field
	private  List<Crops> crops;
	public List<Crops> getCrops() {
		return crops;
	}
	public void setCrops(List<Crops> crops) {
		this.crops = crops;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getFpass() {
		return fpass;
	}
	public void setFpass(String fpass) {
		this.fpass = fpass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFcontact() {
		return fcontact;
	}
	public void setFcontact(String fcontact) {
		this.fcontact = fcontact;
	}
	public String getFlocation() {
		return flocation;
	}
	public void setFlocation(String flocation) {
		this.flocation = flocation;
	}
	public String getFabout() {
		return fabout;
	}
	public void setFabout(String fabout) {
		this.fabout = fabout;
	}
	
	
}
