package com.cg.restful.restfuldemo.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.restful.restfuldemo.model.Message;

@RestController
public class MessageController {
	
	private static BigInteger nextId;
	private  static Map<BigInteger, Message> greetinglist;
	
	public static void savegreetings(Message m) {
		
		if(nextId==null)
			nextId= BigInteger.ONE;
		
		if(greetinglist==null)
			greetinglist=new HashMap<BigInteger, Message>();
		
		m.setId(nextId);
		greetinglist.put(m.getId(), m);
		nextId=nextId.add(BigInteger.ONE);
	}
	
	/*
	 * static {
	 * 
	 * Message m1 = new Message(); m1.setGreeting("hai this is jaffer");
	 * 
	 * Message m2 = new Message(); m2.setGreeting("this is my restful service");
	 * 
	 * savegreetings(m1); savegreetings(m2);
	 * 
	 * }
	 */
	
	@RequestMapping("/")
	public ResponseEntity<Object> getAllmessages(){
		if(greetinglist==null)
			return new ResponseEntity<Object>("greetings not found",HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(greetinglist.values(),HttpStatus.OK);
		
	}
	
	
}
