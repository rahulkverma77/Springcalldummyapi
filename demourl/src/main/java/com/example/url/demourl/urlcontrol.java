package com.example.url.demourl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class urlcontrol {

		
		//private Employee savedUser;
		
			@GetMapping("/hello")
			  public String al() {
				 return urlservice.makeUrl();
			 }

		  @GetMapping("/posts/1")  
			  public String getUrl() 
		  {
			return urlservice.geturl();	  
			  }
		 
}
