package in.co.decimal.api.g;

public class TextBlockRunner {

	public static void main(String[] args) {

		// Normal Way:
		System.out.println("\"First Line\"\nSecond Line\nThird Line");

		// By using text blocks:
		System.out.println("""
				"First Line"
				Second Line
				Third Line
				""");

		System.out.println("""
				"First Line1"
				Second Line1
				Third Line1""");

		System.out.println("""
				"First Line2"
				Second Line2
				Third Line2
				Fourth Line2
				Fift Line2
				Sixth Line2
				""");

		/*--------Another Things----------*/
		String str = """
				Line 1
				Line 2
				Line 3
				""";
		System.out.println(str);

		/*-------Recommended by sir this way write text block--------*/

		String textBlock = """
    			Line1
				Line2
				Line3
				Line4
				""";
		System.out.println(textBlock);

		/*-------WE can also do this ways--------*/

		String textBlockWithFromattedString = """
				Line1: %s
				Line2: %s
				Line3
				Line4
				""".formatted("Vikas", "Basant");

		System.out.println(textBlockWithFromattedString);

	}
}
