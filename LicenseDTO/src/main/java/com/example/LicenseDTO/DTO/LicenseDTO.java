package com.example.LicenseDTO.DTO;

import java.time.LocalDate;

public class LicenseDTO {
	private int id;
	private String organizationEmail;
	private String organizationName;
	private int status;
	private String lisenceKey;
	private LocalDate activationDate;
	private LocalDate ExpiryDate;
	private int gracePeriod;
	
	
	
	public int getId() {
		return id;
	}
	public LocalDate getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
	}
	public LocalDate getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		ExpiryDate = expiryDate;
	}
	public int getGracePeriod() {
		return gracePeriod;
	}
	public void setGracePeriod(int gracePeriod) {
		this.gracePeriod = gracePeriod;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrganizationEmail() {
		return organizationEmail;
	}
	public void setOrganizationEmail(String organizationEmail) {
		this.organizationEmail = organizationEmail;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getLisenceKey() {
		return lisenceKey;
	}
	public void setLisenceKey(String lisenceKey) {
		this.lisenceKey = lisenceKey;
	}
	
	
	

}
