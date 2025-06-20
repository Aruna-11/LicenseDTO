package com.example.LicenseDTO.serviceImplement;

import java.net.URI;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.LicenseDTO.DTO.LicenseDTO;
import com.example.LicenseDTO.Service.Licensedservice;

@Service
public class Licensedtoimplement implements Licensedservice{
	@Autowired
    private RestTemplate restTemplate;
	
	public String getlicense(String lisenceKey) {
		String licenseUrl = "http://localhost:8080/api/randomkey/" + lisenceKey;
		return restTemplate.getForObject(licenseUrl, String.class);
		
	}

	@Override
	public LicenseDTO create(LicenseDTO licenseDTO) {
		String Url="http://localhost:8080/api/post";
		return restTemplate.postForObject(Url,licenseDTO , LicenseDTO.class);
	}

	
	private static final String SECRET_KEY = "1234567890123456"; // 16 characters
	private static final String ALGORITHM = "AES";

	private String encrypt(String plainText) throws Exception {
	    SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
	    Cipher cipher = Cipher.getInstance(ALGORITHM);
	    cipher.init(Cipher.ENCRYPT_MODE, key);
	    byte[] encrypted = cipher.doFinal(plainText.getBytes());
	    return Base64.getEncoder().encodeToString(encrypted);
	}

	private String decrypt(String encryptedText) throws Exception {
	    SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
	    Cipher cipher = Cipher.getInstance(ALGORITHM);
	    cipher.init(Cipher.DECRYPT_MODE, key);
	    byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
	    return new String(decrypted);
	}


}
