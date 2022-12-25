package in.co.decimal.api.d;

class SampleClass {
	String str = null;
}
public class StringNewApiRunner {

	public static void main(String[] args) {

		// Using for wether in the string any non white space character in string or
		// not:
		System.out.println(" ".isBlank());

		// for strip method:
		System.out.println(" LR ");
		System.out.println(" LR ".strip());
		System.out.println("LR ".strip());
		System.out.println(" LR".strip());

		// for strip leading:
		System.out.println(" LR ".stripLeading());

		// for strip trailing:
		System.out.println(" LR ".stripTrailing());

		// for strip trailing with replace:
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));

		// split the string into multiple lines:
		System.out.println("Line1\nline2\nline3".lines()); // it will return stream of lines
		"line1\nline2\nline3".lines().forEach(System.out::println);

		// transform method in java 12
		System.out.println((String) "UPPER".transform(s -> s.substring(2)));

		// formatted method in java 13:
		System.out.println("My name is %s".formatted("Vikash"));

		SampleClass sample = new SampleClass();
		String str = null;
		System.out.println(sample.str.isBlank());
		//		Exception java.lang.NullPointerException: Cannot invoke "String.isBlank()" 
		// because "sample.str" is null.

		System.out.println(str.isBlank());
		//		Exception java.lang.NullPointerException: Cannot invoke "String.isBlank()" 
		//		because "str" is null.

	}

}
