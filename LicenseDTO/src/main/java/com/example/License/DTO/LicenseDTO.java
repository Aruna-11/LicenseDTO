package com.example.License.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LicenseDTO {
	private String organizationEmail;
	private String licenseKey;
	
    public LicenseDTO() {
    	
    }
    
	public LicenseDTO(String organizationEmail, String licenseKey) {
	    this.organizationEmail = organizationEmail;
	    this.licenseKey = licenseKey;
	}
	public String getOrganizationEmail() {
		return organizationEmail;
	}
	public void setOrganizationEmail(String organizationEmail) {
		this.organizationEmail = organizationEmail;
	}
	public String getLicenseKey() {
		return licenseKey;
	}
	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}
	
	 
	

}
