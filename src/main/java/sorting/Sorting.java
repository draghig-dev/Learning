package sorting;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {

		/*/
		 * HashMaps & TreeMaps
		/*/

		// By default, maps will not be sorted because of hashcode
		Map<Integer, String> scores = new HashMap<>();

		scores.put(27, "Draghig");
		scores.put(64, "Brutally");
		scores.put(102, "Michelle");
		scores.put(227, "Luke");

		System.out.println("HashMap Sort: " + scores);

		// Using a TreeMap will have the bonus of being "sorted"
		Map<Integer, String> treeMapScores = new TreeMap<>();

		treeMapScores.put(27, "Draghig");
		treeMapScores.put(64, "Brutally");
		treeMapScores.put(102, "Michelle");
		treeMapScores.put(227, "Luke");

		System.out.println("TreeMap Sort: " + treeMapScores);

		// Using a comparator
		Map<Integer, String> comparatorTreeMapScores = new TreeMap<>(new Comparator<>() {
			@Override
			public int compare(Integer first, Integer second) {
				// Custom comparison method can be used here
				return Integer.compare(second, first);
			}
		});

		comparatorTreeMapScores.put(27, "Draghig");
		comparatorTreeMapScores.put(64, "Brutally");
		comparatorTreeMapScores.put(102, "Michelle");
		comparatorTreeMapScores.put(227, "Luke");

		System.out.println("Comparator Sort: " + comparatorTreeMapScores);

		/*/
		 * Sets
		/*/

		Set<String> names = new HashSet<>();

		names.add("Luke");
		names.add("Michelle");
		names.add("John");

		System.out.println(names);

		// If you want to ensure that a set is using an A-Z sort
		Set<String> namesTreeSet = new TreeSet<>();

		namesTreeSet.add("Luke");
		namesTreeSet.add("Michelle");
		namesTreeSet.add("John");

		System.out.println(namesTreeSet);
	}
}
