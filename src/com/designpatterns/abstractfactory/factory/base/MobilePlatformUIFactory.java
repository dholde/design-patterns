package com.designpatterns.abstractfactory.factory.base;

import com.designpatterns.abstractfactory.product.base.Label;
import com.designpatterns.abstractfactory.product.base.TextField;

public interface MobilePlatformUIFactory {
	
	public TextField createTextField();
	public Label createLabel();

}
