package com.Concept_Based_Problems;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class VotingSystem {
	public void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above to vote.");
		} else {
			System.out.println("Eligible to vote.");
		}
	}
}

public class Custom_Exception_Demo {

	public static void main(String[] args) {
		VotingSystem vs = new VotingSystem();
		try {
			vs.checkAge(16);
		} catch (InvalidAgeException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}

	}

}

// Exception caught: Age must be 18 or above to vote.