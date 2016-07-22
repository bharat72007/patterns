package com.java.proxypattern;

import java.util.*;
public class Resource implements IResource{

	private IResource resource = RealResource.getInstance();
	@Override
	public String readResource(String key) {
		// TODO Auto-generated method stub
		List<String> keyList = new ArrayList<String>();
		keyList.add("One");
		keyList.add("Two");
		keyList.add("Three");
		
		if(keyList.contains(key)){
			return "1";
		}
		else{
			return resource.readResource(key);
		}
	}

	@Override
	public void writeResource(String key, String value) {
		// TODO Auto-generated method stub
		if(key.contains("ABC")){
			//Some Logic
		}
		else{
			resource.writeResource(key, value);
		}
	}
}
