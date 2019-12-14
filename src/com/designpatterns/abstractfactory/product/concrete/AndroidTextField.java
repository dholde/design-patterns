package com.designpatterns.abstractfactory.product.concrete;

import com.designpatterns.abstractfactory.product.base.TextField;

public class AndroidTextField implements TextField  {

	@Override
	public void render() {
		
		System.out.println("\n<TextField type='android'>This is a Text Field that looks like it was native Android</TextField>\n\n");
		
	}

}
