package dev.brutally.learning.house;

public class House {

	private static int registeredHouses = 0;

	private final int size;

	public House(int size) {
		this.size = size;

		System.out.println("New houses registered: " + ++registeredHouses);
	}

	public int getSize() {
		return this.size;
	}

	// Overriding the "toString()" method to make it
	// easier to distinguish between multiple instances.
	@Override
	public String toString() {
		return "House{" + size + "}";
	}

	public static int getRegisteredHouses() {
		return registeredHouses;
	}
}
