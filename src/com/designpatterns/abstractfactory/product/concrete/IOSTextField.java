package com.designpatterns.abstractfactory.product.concrete;

import com.designpatterns.abstractfactory.product.base.TextField;

public class IOSTextField implements TextField {

	@Override
	public void render() {
		
		System.out.println("\n<TextField type='ios'>This is a Text Field that looks like it was native iOS</TextField>\n\n");

	}

}
