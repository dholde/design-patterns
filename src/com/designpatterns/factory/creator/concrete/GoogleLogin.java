package com.designpatterns.factory.creator.concrete;

import com.designpatterns.factory.creator.base.LoginWindow;
import com.designpatterns.factory.product.base.LoginButtonInterface;
import com.designpatterns.factory.product.concrete.GoogleLoginButton;

public class GoogleLogin extends LoginWindow {

	@Override
	public LoginButtonInterface createButton() {
		return new GoogleLoginButton();
	}

}
