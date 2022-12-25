package in.co.decimal.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static boolean isEven(Integer numbers) {
		return numbers % 2 == 0;
	}
	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 5, 6, 77, 88);

		//		// Now we have even number predicate defined:
		//		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		//
		//		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
		//
		//		// for the odd numbers: .negate() method is used.
		//		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);

		/**
		 * By this method their is no .negate() method present for methods:
		 **/
		numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);

		/**
		 * That why Predicate.not() is used:
		 **/
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
	}
}
