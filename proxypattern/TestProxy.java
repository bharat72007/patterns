package com.java.proxypattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProxy {

	@Test
	public void testProxyReadAPI() {
		IResource resource = Factory.getResource();
		resource.readResource("One");
		resource.writeResource("abc", "mno");
		
	}

}
