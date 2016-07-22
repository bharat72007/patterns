package com.java.proxypattern;

public interface IResource {
	
	String readResource(String key);
	void writeResource(String key,String value);
}
