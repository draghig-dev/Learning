package dev.brutally.learning.random;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int randomNumber = random.nextInt(30); // Generates a random number between 0 and 29

			System.out.println(randomNumber);
		}

		// Grabbing a random object from a list
		String[] names = {"Luke", "Michelle", "John", "Sadie", "Roxy", "Paris"};

		System.out.println(names[random.nextInt(names.length - 1)]);
	}
}
