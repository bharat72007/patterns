package com.java.statepattern;

class Two implements State {

	@Override
	public State next() {
		// TODO Auto-generated method stub
		System.out.println(Two.class.getName());
		return Cache.get("three");
	}

}
