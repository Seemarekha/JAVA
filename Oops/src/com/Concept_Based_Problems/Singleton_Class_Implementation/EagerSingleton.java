package com.Concept_Based_Problems.Singleton_Class_Implementation;

public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	public EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
