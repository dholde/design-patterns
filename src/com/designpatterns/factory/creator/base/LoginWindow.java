package com.designpatterns.factory.creator.base;

import com.designpatterns.factory.product.base.LoginButtonInterface;

public abstract class LoginWindow {
	
	private LoginButtonInterface loginButton;
	
	public void render() {
		loginButton = createButton();
		loginButton.render();
	}
	
	public void performLogin() {
		loginButton.login();
	}
	
	public abstract LoginButtonInterface createButton();

}
