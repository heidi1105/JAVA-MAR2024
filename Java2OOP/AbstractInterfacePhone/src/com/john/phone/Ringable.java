package com.john.phone;

public interface Ringable {

	public void ring();
	
	public default void unlock() {
		System.out.println("click phone unlocked");
	}
}
