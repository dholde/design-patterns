package com.designpatterns;

import com.designpatterns.creational.abstractfactory.AbstractFactoryPatternRunner;
import com.designpatterns.creational.builder.BuilderPatternRunner;
import com.designpatterns.creational.factory.FactoryPatternRunner;
import com.designpatterns.creational.prototype.PrototypePatternRunner;
import com.designpatterns.creational.singleton.simple.SingletonPatternRunner;

public class Main {

	public static void main(String[] args) {
		
		//runFactoryPattern();
		//runAbstractFactoryPattern();
		//runBuilderPattern();
		//runPrototypePattern();
		runSingletonPattern();

	}

	private static void runSingletonPattern() {
		var runner = new SingletonPatternRunner();
		runner.runPattern();
		
	}

	private static void runPrototypePattern() {
		var runner = new PrototypePatternRunner();
		runner.runPattern();
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
