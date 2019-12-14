package com.designpatterns.abstractfactory;

import com.designpatterns.PatternExampleRunner;
import com.designpatterns.abstractfactory.factory.base.MobilePlatformUIFactory;
import com.designpatterns.abstractfactory.factory.concrete.AndroidFactory;
import com.designpatterns.abstractfactory.factory.concrete.IOSFactory;
import com.designpatterns.abstractfactory.product.base.Label;
import com.designpatterns.abstractfactory.product.base.TextField;

public class AbstractFactoryPatternRunner implements PatternExampleRunner {
	
	private Label label;
	private TextField textField;
	
	public AbstractFactoryPatternRunner(String mobilePlatform) {
		var factory = getFactoryForPlatform(mobilePlatform);
		label = factory.createLabel();
		textField = factory.createTextField();
	}

	@Override
	public void runPattern() {
		label.render();
		textField.render();
		
	}
	
	private static MobilePlatformUIFactory getFactoryForPlatform(String mobilePlatform) {
		MobilePlatformUIFactory factory = null;
		switch (mobilePlatform) {
		case "iOS":
			factory = new IOSFactory();
		case "Android": 
			factory = new AndroidFactory();
		default:
			break;
		}
		return factory;
	}

}
