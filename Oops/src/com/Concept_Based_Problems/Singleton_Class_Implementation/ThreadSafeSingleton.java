package com.Concept_Based_Problems.Singleton_Class_Implementation;

public class ThreadSafeSingleton {
	private static volatile ThreadSafeSingleton instance;

	public ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
