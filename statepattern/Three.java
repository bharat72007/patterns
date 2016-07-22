package com.java.statepattern;

class Three implements State{

	@Override
	public State next() {
		// TODO Auto-generated method stub
		System.out.println(Three.class.getName());
		return Cache.get("fourth");
	}

}
