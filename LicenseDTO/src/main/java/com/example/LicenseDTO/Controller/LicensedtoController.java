package com.example.LicenseDTO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LicenseDTO.DTO.LicenseDTO;

@RestController
@RequestMapping("/pro")

public class LicensedtoController {
	@Autowired
	public com.example.LicenseDTO.Service.Licensedservice Licensedservice;
	
	
	@GetMapping("/license/{lisenceKey}")
	public String getlicense(@PathVariable String lisenceKey) {
		
		return Licensedservice.getlicense(lisenceKey);
	}

	
	@PostMapping("/propost")
	public LicenseDTO  create(@RequestBody LicenseDTO licenseDTO) {
		return Licensedservice.create(licenseDTO);
	}
	
	
}
