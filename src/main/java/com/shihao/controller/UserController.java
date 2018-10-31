package com.shihao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shihao.model.User;
import com.shihao.service.UserService;

import com.alibaba.fastjson.JSONObject;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	 @RequestMapping("/hello")  
     public String index() {  
          return"Hello World";  
     } 
	 
	 
	 @RequestMapping("/get")  
	 @ResponseBody
     public String get(User user) {  
		 User us=userService.getNameById(user);
		 return JSONObject.toJSONString(us);
     }


}
