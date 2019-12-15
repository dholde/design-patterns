package com.designpatterns.creational.factory.creator.concrete;

import com.designpatterns.creational.factory.creator.base.LoginWindow;
import com.designpatterns.creational.factory.product.base.LoginButtonInterface;
import com.designpatterns.creational.factory.product.concrete.GoogleLoginButton;

public class GoogleLogin extends LoginWindow {

	@Override
	public LoginButtonInterface createButton() {
		return new GoogleLoginButton();
	}

}
