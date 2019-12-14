package com.designpatterns.abstractfactory.product.concrete;

import com.designpatterns.abstractfactory.product.base.Label;

public class AndroidLabel implements Label{

	@Override
	public void render() {
		
		System.out.println("\n<Label type='android'>This is a Label that looks like it was native Android</Label>\n\n");
		
	}

}
