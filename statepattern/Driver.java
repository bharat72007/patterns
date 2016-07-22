package com.java.statepattern;

public class Driver {

	public static void main(String args[]){

		State start = Cache.get("one");
		State current = start;
		for(int i=0;i<=8;i++){
			current = current.next();

		}
	}
}
