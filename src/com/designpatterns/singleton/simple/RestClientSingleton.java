package com.designpatterns.singleton.simple;

public class RestClientSingleton {
	
	private static RestClientSingleton sharedRestClient;
	
	private RestClientSingleton() {
		
	}
	
	public static RestClientSingleton getSaredRestClient() {
		if (sharedRestClient != null) {
			System.out.println("Returning existing Instance of the Rest Client");
			return sharedRestClient; 
		} else {
			System.out.println("First initialization of the Rest Client.");
			sharedRestClient = new RestClientSingleton();
			return sharedRestClient;
		}
	}
}
