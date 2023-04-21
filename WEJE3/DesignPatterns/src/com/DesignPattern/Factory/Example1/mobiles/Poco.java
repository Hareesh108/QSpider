package com.DesignPattern.Factory.Example1.mobiles;

import com.DesignPattern.Factory.Example1.mobile.Mobile;

public class Poco implements Mobile {
	@Override
	public void start() {
		System.out.println("Poco Started");
	}
}
