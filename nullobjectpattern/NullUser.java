package com.java.nullobjectpattern;

import java.util.Collections;
import java.util.List;

//FAKE Object : created which will be returned to Client, In case there is no Business Needs.
public class NullUser extends User{

	public NullUser(String Id, String name, Integer age) {
		super(Id, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(String appId) {
		// TODO Auto-generated method stub
		//Nothing TODO
	}

	@Override
	public boolean authentic() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> skills() {
		// TODO Auto-generated method stub
		//Don't Return null, for Skills, Instead return Empty List.This will not break Client Code
		//Who is not handling null checks on Collection.
		return Collections.emptyList();
		//return null;
	}

}
