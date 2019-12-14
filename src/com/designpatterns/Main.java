package com.designpatterns;

import com.designpatterns.abstractfactory.AbstractFactoryPatternRunner;
import com.designpatterns.builder.BuilderPatternRunner;
import com.designpatterns.factory.FactoryPatternRunner;

public class Main {

	public static void main(String[] args) {
		
		// runFactoryPattern();
		//runAbstractFactoryPattern();
		runBuilderPattern();

	}

	private static void runFactoryPattern() {
		var runner = new FactoryPatternRunner();
		runner.runPattern();
	}
	
	private static void runAbstractFactoryPattern() {
		//var platform = "iOS";
	    var platform = "Android";
		var runner = new AbstractFactoryPatternRunner(platform);
		runner.runPattern();
	}
	
	private static void runBuilderPattern() {
		var runner = new BuilderPatternRunner();
		runner.runPattern();
	}

}
