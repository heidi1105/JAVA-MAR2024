package com.john.ninjas;

public class Ninja {
//	member variables
	private String name;
	private int health;
	private int strength;
	private Boolean isTired;
	
//	constructor(s) -> create defaults
	public Ninja() {
		this.name = "anonymous";
		this.health = 100;
		this.strength = 10;
		this.isTired = true;
	}
	
//	overloading the constructor
	public Ninja(String someName, int someHealth, int someStrength) {
		this.name = someName;
		this.health = someHealth;
		this.strength = someStrength;
	}
	
//	=== METHODS ===

	public void attack(Ninja enemy) {
		System.out.println(this.getName() + " attacks " + enemy.getName());
		enemy.setHealth(enemy.getHealth() - 120);
		System.out.println(enemy.getName() + " now has " + enemy.getHealth() + " hp");
	}
	
	

//	==== GETTER AND SETTERS ====
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public Boolean getIsTired() {
		return isTired;
	}

	public void setIsTired(Boolean isTired) {
		this.isTired = isTired;
	}
	
	
 
}
