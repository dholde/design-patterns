package com.designpatterns.creational.abstractfactory.factory.concrete;

import com.designpatterns.creational.abstractfactory.factory.base.MobilePlatformUIFactory;
import com.designpatterns.creational.abstractfactory.product.base.Label;
import com.designpatterns.creational.abstractfactory.product.base.TextField;
import com.designpatterns.creational.abstractfactory.product.concrete.IOSLabel;
import com.designpatterns.creational.abstractfactory.product.concrete.IOSTextField;

public class IOSFactory implements MobilePlatformUIFactory {

	@Override
	public TextField createTextField() {
		return new IOSTextField();
	}

	@Override
	public Label createLabel() {
		return new IOSLabel();
	}

}
