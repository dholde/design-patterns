package com.designpatterns.creational.abstractfactory.product.concrete;

import com.designpatterns.creational.abstractfactory.product.base.Label;

public class IOSLabel implements Label {

	@Override
	public void render() {
		
		System.out.println("\n<Label type='ios'>This is a Label that looks like it was native iOS</Label>\n\n");

	}

}
