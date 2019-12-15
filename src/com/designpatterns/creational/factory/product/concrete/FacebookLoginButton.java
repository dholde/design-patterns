package com.designpatterns.creational.factory.product.concrete;

import com.designpatterns.creational.factory.product.base.LoginButtonInterface;

public class FacebookLoginButton implements LoginButtonInterface {

	@Override
	public void login() {
		System.out.println("You're loggin in with Facebook ... "
				+ "\nChecking Credentials ..."
				+ "\n\nYou successfully logged in with Facebook!");
	}

	@Override
	public void render() {
		System.out.println("\n<Button type='facebook-login'>Login with Facebook</Button>\n\n");
	}

}
