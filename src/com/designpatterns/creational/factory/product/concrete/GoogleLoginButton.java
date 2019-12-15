package com.designpatterns.creational.factory.product.concrete;

import com.designpatterns.creational.factory.product.base.LoginButtonInterface;

public class GoogleLoginButton implements LoginButtonInterface {
	
	
	@Override
	public void render() {
		System.out.println("\n<Button type='google-login'>Login with Google</Button>\n\n");
	}

	@Override
	public void login() {
		System.out.println("You're loggin in with Google ... "
				+ "\nChecking Credentials ..."
				+ "\n\nYou successfully logged in with Google!");
	}

}
