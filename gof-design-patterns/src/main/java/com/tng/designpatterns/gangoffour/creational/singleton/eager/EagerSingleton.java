/*
 * This is the most straightforward Singleton type.
 * 
 * How it works:
 * The instance is created as soon as the class is loaded into memory.
 * The private constructor ensures no other class can create a new instance.
 * The getInstance() method simply returns the already created instance.
 * 
 * Pros:
 * Very simple to implement.
 * No synchronization issues (thread-safe by default).
 * 
 * Cons:
 * The instance is created even if it’s never used, which can waste resources.
 * 
 */

package com.tng.designpatterns.gangoffour.creational.singleton.eager;

//Eager Initialization Singleton
public class EagerSingleton {
    // Instance is created at the time of class loading
	private static final EagerSingleton instance = new EagerSingleton();
	
    // Private constructor prevents instantiation from other classes
	private EagerSingleton() {
		
	}
    // Global access point
	public static EagerSingleton getInstance() {
		return instance;
	}
    // Example method
	public void showMessage() {
		System.out.println("Hi iam a eager singlton");
	}
}
