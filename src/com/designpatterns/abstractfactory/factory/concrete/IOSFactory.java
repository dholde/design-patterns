package com.designpatterns.abstractfactory.factory.concrete;

import com.designpatterns.abstractfactory.factory.base.MobilePlatformUIFactory;
import com.designpatterns.abstractfactory.product.base.Label;
import com.designpatterns.abstractfactory.product.base.TextField;
import com.designpatterns.abstractfactory.product.concrete.IOSLabel;
import com.designpatterns.abstractfactory.product.concrete.IOSTextField;

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
