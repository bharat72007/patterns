package com.java.nullobjectpattern;

import java.util.List;

//Abstract User: Which Will be Inherited By AppUser{REAL App User and NULL USER(FAKE Object)}
public abstract class User {
	
	private String Id;
	private String name;
	private Integer age;
	
	public User(String Id, String name, Integer age){
		this.age =age;
		this.Id =Id;
		this.name = name;
	}
	
	//Getters..
	public String getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public abstract void register(String appId);
	
	public abstract boolean authentic();
	
	public abstract List<String> skills();
}
