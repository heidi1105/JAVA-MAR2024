package com.john.ninjas;

import java.util.ArrayList;

public class Sensei extends Ninja {
	
	private ArrayList<String> skills;
	private String wisdom;
	
	public Sensei(String name, String someWisdom ) {
		super(name,  1000, 1000);
		this.skills = new ArrayList<String>();
		this.wisdom = someWisdom;
	}

	
//	=== GETTERS AND SETTERS ===
	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public String getWisdom() {
		return wisdom;
	}

	public void setWisdom(String wisdom) {
		this.wisdom = wisdom;
	}
	
	

}
