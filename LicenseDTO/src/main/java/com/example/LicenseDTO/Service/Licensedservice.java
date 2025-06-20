package com.example.LicenseDTO.Service;

import com.example.LicenseDTO.DTO.LicenseDTO;

public interface Licensedservice {

	String getlicense(String lisenceKey);
	
	LicenseDTO create(LicenseDTO licenseDTO);
	
	

}
