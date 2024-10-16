package dev.brutally.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Learning {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(27);
		numbers.add(364);
		numbers.add(27);

		for (int number : numbers)
			System.out.println(number);

		for (int index = 0; index < numbers.size(); index++)
			System.out.println(numbers.get(index));

		System.out.println("Numbers before: " + numbers);

		for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
			int number = iterator.next();

			if (number < 364) {
				iterator.remove();
				continue;
			}
			System.out.println(number);
		}
		System.out.println("Numbers after: " + numbers);
	}
}
