package com.kls.controller;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kls.bean.User;
import com.kls.connection.MongoFactory;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;

public class AddController {
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		 MongoCollection collection = MongoFactory.getConnection();
	        DBObject document1 = new BasicDBObject();
     document1.put("name", user.getName());
     document1.put("pass", user.getPass());
     document1.put("mobile Number",user.getMobileNumber());
     document1.put("email",user.getEmail());
     collection.insertOne(document1);
		return "welcome";
	}

}
