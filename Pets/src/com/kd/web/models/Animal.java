package com.kd.web.models;

public class Animal {
	
	public String name;
	public String breed;
	public int weight;
	
	public Animal() {
	
	}

	public Animal(String name, String breed, int weight) {
		
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
