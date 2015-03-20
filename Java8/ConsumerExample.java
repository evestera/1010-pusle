import java.util.function.*;
import java.util.*;

class ConsumerExample {
	public static void main(String[] args) {
		heiHallo(System.out::println);

		List<String> list = new LinkedList<String>();
		heiHallo(list::add);
		System.out.println(list);
	}

	static void heiHallo(Consumer<String> s) {
		s.accept("Hei");
		s.accept("Hallo");
	}
}