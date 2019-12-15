package com.designpatterns.creational.abstractfactory.factory.concrete;

import com.designpatterns.creational.abstractfactory.factory.base.MobilePlatformUIFactory;
import com.designpatterns.creational.abstractfactory.product.base.Label;
import com.designpatterns.creational.abstractfactory.product.base.TextField;
import com.designpatterns.creational.abstractfactory.product.concrete.AndroidLabel;
import com.designpatterns.creational.abstractfactory.product.concrete.AndroidTextField;

public class AndroidFactory implements MobilePlatformUIFactory {

	@Override
	public TextField createTextField() {
		return new AndroidTextField();
	}

	@Override
	public Label createLabel() {
		return new AndroidLabel();
	}

}
