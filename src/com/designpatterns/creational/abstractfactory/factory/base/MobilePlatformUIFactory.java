package com.designpatterns.creational.abstractfactory.factory.base;

import com.designpatterns.creational.abstractfactory.product.base.Label;
import com.designpatterns.creational.abstractfactory.product.base.TextField;

public interface MobilePlatformUIFactory {
	
	public TextField createTextField();
	public Label createLabel();

}
