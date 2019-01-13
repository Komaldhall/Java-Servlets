package com.kd.web.models;

public class Dogs extends Animal implements Pet{
	
	public Dogs(String name, String breed, int weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	public String showAffection() {
		if (this.weight<30) 
		{
			return (name+" hopped into your lap and cuddles you!");
		}
		else
		{
			return(name+" curled up next to you!");
		}
		
	}

}
