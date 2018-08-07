package com.airtel.controller;

 
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {
	
 @Autowired
 private ProducerTemplate producerTemplate;
 
 
 @RequestMapping(value = "/")
 public void startCamel() {
	 System.out.println("hello");
  producerTemplate.sendBody("direct:firstRoute", "Calling via Spring Boot Rest Controller");
 }
}
