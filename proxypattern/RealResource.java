package com.java.proxypattern;

public class RealResource implements IResource{

	private static volatile RealResource instance = null;
	
	public synchronized static RealResource getInstance(){
		if(instance == null){
			instance =  new RealResource();
		}
		return instance;
	}
	
	private RealResource(){
		
	}
	
	
	@Override
	public String readResource(String key) {
		// TODO Auto-generated method stub
		System.out.println("Reached Real Resource");
		return null;
	}

	@Override
	public void writeResource(String key, String value) {
		// TODO Auto-generated method stub
		System.out.println("Reached Real Resource");
	}

	
}
