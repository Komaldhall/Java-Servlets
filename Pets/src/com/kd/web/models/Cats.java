package com.kd.web.models;

public class Cats extends Animal implements Pet{
	
	public Cats(String name, String breed, int weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	public String showAffection() {
		return("Your "+breed+" cat, "+name+", looked at you with some affection. You think.");
	}


}
