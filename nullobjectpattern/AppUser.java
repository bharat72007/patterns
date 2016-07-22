package com.java.nullobjectpattern;

import java.util.ArrayList;
import java.util.List;

//REAL User Object
public class AppUser extends User {

	public AppUser(String Id, String name, Integer age) {
		super(Id, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(String appId) {
		// TODO Auto-generated method stub
		System.out.println("Perform Registration");
	}

	@Override
	public boolean authentic() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<String> skills() {
		// TODO Auto-generated method stub
		List<String> skills = new ArrayList<String>();
		skills.add("Java");
		skills.add("C++");
		return skills;
	}
}
