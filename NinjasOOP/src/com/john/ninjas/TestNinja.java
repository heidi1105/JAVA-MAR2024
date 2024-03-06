package com.john.ninjas;

public class TestNinja {

	public static void main(String[] args) {
		Ninja goku = new Ninja("Goku", 500, 9001);
		Ninja naruto = new Ninja("Naruto", 500, 5000);
		
		goku.attack(naruto);
		
		Sensei splinter = new Sensei("Splinter", "always reach out for help!");
//		splinter.setName("Splinter");
		System.out.println(splinter.getName());
		System.out.println(splinter.getWisdom());
		
		splinter.attack(goku);
		
	}
	

}
