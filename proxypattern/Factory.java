package com.java.proxypattern;

public class Factory {
	
	public static IResource getResource(){
		return new Resource();
	}

}
