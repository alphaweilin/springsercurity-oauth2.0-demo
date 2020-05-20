package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyTest {
	
	@Test
	public void testForEncoder() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("123456"));
		//$2a$10$GJx4Vf1QMF7uwv3d2M2pHeZjWv67kWEZcj/gzQ2hA8g3AFEN7V2Wu
		System.out.println(encoder.encode("12345678"));
		
		System.out.println(new org.apache.tomcat.util.codec.binary.Base64().encodeAsString("my-client-1:12345678".getBytes()));
        System.out.println(java.util.Base64.getEncoder().encodeToString("my-client-1:12345678".getBytes()));
	} 
}
