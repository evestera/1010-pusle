import java.util.*;
import java.util.stream.*;

/*
Viser 3 forskjellige måter å sette sammen en List<String> til en String,
og en måte å lage en String med tilfeldige bokstaver.

(Måten som bruker StringBuilder er nok den raskeste)
*/

class ConcatList {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("f", "o", "o", "b", "a", "r");
		String foo = ls.stream().reduce("", (a, b) -> a + b);
		System.out.println(foo);

		StringBuilder fooBuilder = new StringBuilder();
		ls.forEach(fooBuilder::append);
		System.out.println(fooBuilder.toString());

		System.out.println(ls.stream().collect(Collectors.joining()));

		Random r = new Random();
		String randoms = Stream.generate(() -> ("" + (char) (r.nextInt(26) + 97)))
			.limit(10)
			.reduce("", (a, b) -> a + b);
		System.out.println(randoms);
	}
}