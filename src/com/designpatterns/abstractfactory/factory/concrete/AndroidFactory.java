package com.designpatterns.abstractfactory.factory.concrete;

import com.designpatterns.abstractfactory.factory.base.MobilePlatformUIFactory;
import com.designpatterns.abstractfactory.product.base.Label;
import com.designpatterns.abstractfactory.product.base.TextField;
import com.designpatterns.abstractfactory.product.concrete.AndroidLabel;
import com.designpatterns.abstractfactory.product.concrete.AndroidTextField;

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
