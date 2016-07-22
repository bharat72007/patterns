package com.java.statepattern;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	
	private static Map<String,State> cache = new HashMap<String,State>();
	
	static{
		cache.put("one",new One());
		cache.put("two",new Two());
		cache.put("three",new Three());
		cache.put("fourth",new Fourth());
	}
	
	public static State get(String key){
		return cache.get(key);
	}
}
