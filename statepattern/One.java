package com.java.statepattern;

class One implements State{

	@Override
	public State next() {
		// TODO Auto-generated method stub
		System.out.println(One.class.getName());
		return Cache.get("two");
	}

}
