package com.DesignPattern.Factory.Example1.mobiles;

import com.DesignPattern.Factory.Example1.mobile.Mobile;

public class IPhone11 implements Mobile {

	@Override
	public void start() {
		System.out.println("IPhone11 Started");
	}
}
