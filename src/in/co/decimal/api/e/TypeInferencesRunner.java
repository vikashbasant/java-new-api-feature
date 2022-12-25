package in.co.decimal.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("vikash", "Kumar", "basant");
		List<String> names2 = List.of("prince", "lala", "saxena");

		//		List<List<String>> names = List.of(names1, names2);

		// here List<List<String>> this is very complicated:
		// so we can used type inference...var
		var names = List.of(names1, names2);
		names.stream().forEach(System.out::println);

		// we can also used 'var' in for loop:
		for (var i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (var name : names1) {
			System.out.println(name);
		}

		// with 'var' we can't assign 'null' to it:
		// var x = null; // Cannot infer type for local variable initialized to 'null'.

		// 'var' is not a keyword:
		var var = "Vikash";
		System.out.println(var);

		// List.of("vikash", "Kumar", "basant").stream().filter(s -> s.length() <
		// 6).filter.forEach(System.out::println);
		// now we can used alt+shift+l:
		// then we can name filter:

		// Stream<String> filter = List.of("vikash", "Kumar",
		// "basant").stream().filter(s -> s.length() < 6);
		var filter = List.of("vikash", "Kumar", "basant").stream().filter(s -> s.length() < 6);
		filter.forEach(System.out::println);

	}
}
