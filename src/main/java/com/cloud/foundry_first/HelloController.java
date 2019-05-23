package com.cloud.foundry_first;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
private String hello;    
	
	@RequestMapping("/helloJsp")
	public String helloJsp(Map<String,Object> map){
		//System.out.println("HelloController.helloJsp().hello=hello");
		map.put("name","hello");
		return "helloJsp";
	}
}
