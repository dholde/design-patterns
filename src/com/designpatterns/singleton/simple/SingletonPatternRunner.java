package com.designpatterns.singleton.simple;

import com.designpatterns.PatternExampleRunner;

public class SingletonPatternRunner implements PatternExampleRunner {

	@Override
	public void runPattern() {
		
		var restClient = RestClientSingleton.getSaredRestClient();
		var hopefullyTheSameRestlclient = RestClientSingleton.getSaredRestClient();

	}

}
