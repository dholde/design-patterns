package com.designpatterns.creational.factory.creator.base;

import com.designpatterns.creational.factory.product.base.LoginButtonInterface;

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
