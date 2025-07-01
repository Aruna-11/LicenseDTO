package com.example.LicenseDTO.Controller;



import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.License.DTO.LicenseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;






@RestController
@RequestMapping("/pro")

public class LicensedtoController {
	@Autowired
	public com.example.LicenseDTO.Service.Licensedservice Licensedservice;
	
	 private static final List<Map<String, String>> licenses = new ArrayList<>();
	 
	 @GetMapping("/status")
	    public String getStatus(@RequestParam String email) {
	        return licenses.stream()
	                .filter(l -> l.get("email").equalsIgnoreCase(email))
	                .map(l -> "License status: " + l.get("status"))
	                .findFirst()
	                .orElse("No license found for given email");
	    }

}
