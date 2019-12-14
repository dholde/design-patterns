package com.designpatterns.factory;

import com.designpatterns.PatternExampleRunner;
import com.designpatterns.factory.creator.concrete.FacebookLogin;
import com.designpatterns.factory.creator.concrete.GoogleLogin;

public class FactoryPatternRunner implements PatternExampleRunner {

	@Override
	public void runPattern() {
		/*
		 * Choose login method
		 */
		
		//var loginMethod = "Facebook";
		var loginMethod = "Google";
		
		if(loginMethod.equals("Facebook")) {
			var loginWindow = new FacebookLogin();
			loginWindow.render();
			loginWindow.performLogin();
			
		} else if(loginMethod.equals("Google")) {
			var loginWindow = new GoogleLogin();
			loginWindow.render();
			loginWindow.performLogin();
		}
		
	}
	
	

}
