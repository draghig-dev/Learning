package dev.brutally.learning.hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

	public static void main(String[] args) {
		Map<UniquePerson, Integer> map = new HashMap<>();

		map.put(new UniquePerson("hello"), 1);
		map.put(new UniquePerson("hello"), 1);

		System.out.println(map);
	}
}
