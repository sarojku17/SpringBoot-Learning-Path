package com.springlearning.RESTfulWebService.model;

public class Greating {

	private final long id;
	private String greating;
	
	public String getGreating() {
		return greating;
	}

	public void setGreating(String greating) {
		this.greating = greating;
	}

	public long getId() {
		return id;
	}
	
	public Greating(long id, String greating) {
		super();
		this.id = id;
		this.greating = greating;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
