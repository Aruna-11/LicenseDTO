package com.example.LicenseDTO.serviceImplement;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.example.License.DTO.LicenseDTO;
import com.example.LicenseDTO.Service.Licensedservice;



@Service
public class Licensedtoimplement implements Licensedservice {
	@Autowired
    private RestTemplate restTemplate;
	

	 @Override
	    public String checkAndActivate(String licenseKey, String organizationEmail) {
	        return "checkAndActivate moved to Admin Service";
	    }

    @Override
    public Map<String, String> activateLicense(String licenseKey) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "activateLicense not implemented yet");
        return response;
    }

    @Override
    public boolean isValidEmail(String organizationEmail) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return java.util.regex.Pattern.matches(emailRegex, organizationEmail);
    }

    @Override
    public boolean isValidLicenseKey(String licenseKey) {
        String licenseKeyRegex = "^[A-Z0-9]{16}$";
        return java.util.regex.Pattern.matches(licenseKeyRegex, licenseKey);
    }
}
