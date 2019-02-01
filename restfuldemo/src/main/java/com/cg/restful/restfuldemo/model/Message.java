package com.cg.restful.restfuldemo.model;

import java.math.BigInteger;

public class Message {
	
	private BigInteger id;
	private String greeting;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", greeting=" + greeting + "]";
	}
	
	
	
	
	
}
