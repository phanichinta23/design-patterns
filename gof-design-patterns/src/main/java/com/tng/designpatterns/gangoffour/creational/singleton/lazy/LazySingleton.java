/*
 * This is the simplest form of Singleton, but remember: it’s not thread-safe.
 *  In a multi-threaded environment, two threads could create separate instances simultaneously
 * 
 * How it works:
 * The constructor is private, so you cannot create objects with new LazySingleton()
 * The static method getInstance() ensures only one instance is created.
 * The instance is created lazily (only when first requested).
 * 
 * Pros:
 * Memory Efficient: The instance is created only when it’s actually needed, 
 * saving resources if it’s never used.
 * 
 * Simple Implementation: Easy to understand and implement with minimal code.
 * 
 * Deferred Initialization: Useful when the singleton object is 
 * heavy to create and may not be required during application startup.
 * 
 * Cons:
 * Not Thread-Safe (Basic Version): In a multi-threaded environment, two threads could simultaneously 
 * enter the getInstance() method and create separate instances.
 * 
 * Potential Performance Issues: If you add synchronization to make it thread-safe, 
 * it can slow down access due to locking overhead.
 * 
 * Complexity in Fixing Thread Safety: Solutions like double-checked locking or using volatile add 
 * complexity compared to eager initialization.
 * 
 */
package com.tng.designpatterns.gangoffour.creational.singleton.lazy;

//Basic Singleton Pattern (Lazy Initialization)
public class LazySingleton {
    // Step 1: Create a private static instance variable
	private static LazySingleton instance;
	
    // Step 2: Make the constructor private so no one can instantiate directly
	private LazySingleton() {
		System.out.println("Lazy Singleton instnace created");
	}
	
    // Step 3: Provide a public static method to get the instance
	public LazySingleton getInstance() {
		
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
    // Example method
	public void showMessage() {
		System.out.println("This message is from LazySingleton class");
	}
}
