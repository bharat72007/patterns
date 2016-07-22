package com.java.statepattern;

class Fourth implements State{

	@Override
	public State next() {
		// TODO Auto-generated method stub
		System.out.println(Fourth.class.getName());
		return Cache.get("two");
	}

}
