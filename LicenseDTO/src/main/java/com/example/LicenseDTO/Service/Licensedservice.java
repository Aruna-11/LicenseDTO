package com.example.LicenseDTO.Service;

import java.util.Map;

public interface Licensedservice {
	
	
	boolean isValidEmail(String organizationEmail);
	boolean isValidLicenseKey(String licenseKey);
	
	

	Map<String, String> activateLicense(String licenseKey);
	String checkAndActivate(String licenseKey, String organizationEmail);
	 
	

}
