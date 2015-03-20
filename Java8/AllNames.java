import java.util.*;
import java.io.*;
import java.util.stream.*;

class AllNames {
	public static void main(String[] args) throws IOException {
		List<String> words = new LinkedList<>();

		new Scanner(new File("pride.txt"))
			.forEachRemaining(words::add);

		List<String> names = words.stream()
			.flatMap(s -> Stream.of(s.split("--")))
			.filter(s -> s.length() > 0)
			.filter(s -> Character.isUpperCase(s.charAt(0)))
			.map(s -> s.replaceAll("[.,\"!()\\-;:?_]|('s)|'", ""))
			.filter(s -> s.length() > 2)
			.map(String::toLowerCase)
			.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
			.distinct()
			.sorted()
			.collect(Collectors.toList());

		System.out.println(names);
		System.out.println(names.size());

		long count = words.stream()
			.filter(s -> s.startsWith("Bingley"))
			.count();

		System.out.println(count);
	}
}