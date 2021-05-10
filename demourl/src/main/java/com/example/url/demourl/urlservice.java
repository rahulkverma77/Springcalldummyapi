package com.example.url.demourl;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class urlservice {
	
	 public static String makeUrl()
	 {
		 return "HELLO";
	 }
	 public static String geturl()
	 {
		 final String uri = "https://jsonplaceholder.typicode.com/posts/1";
		 RestTemplate restTemplate = new RestTemplate();
		 String result = restTemplate.getForObject(uri, String.class);
		 return result;
	 }
			 
}
