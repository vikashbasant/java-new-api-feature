package in.co.decimal.api.f;

public class SwitchExpressionRunner {

	public static String findDayOfTheWeek(int day) {
		String dayOfWeek = "";
		switch(day) {
		case 0:
			dayOfWeek = "Sunday";
			break;

		case 1:
			dayOfWeek = "Monday";
			break;

		case 2:
			dayOfWeek = "Tuesday";
			break;

		case 3:
			dayOfWeek = "Wednesday";
			break;

		case 4:
			dayOfWeek = "Thrusday";
			break;

		case 5:
			dayOfWeek = "Friday";
			break;

		case 6:
			dayOfWeek = "Sturday";
			break;

		default:
			throw new IllegalArgumentException("Invalid Option " + day);
		}

		return dayOfWeek;
	}

	public static String findDayOfTheWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch(day) {
		case 0 -> {
			System.out.println("Do Some Complex Logic Here");

			// yield statement is used n a switch expression
			// break, continue statements are used in a switch statement:

			// instated of return we can used but it is mandatory!
			yield "Sunday";
		}

		case 1 -> "Monday";

		case 2 -> "Tuesday";

		case 3 -> "Wednesday";

		case 4 -> "Thrusday";

		case 5 -> "Friday";

		case 6 -> "Sturday";

		default -> throw new IllegalArgumentException("Invalid Option " + day);
		};

		return dayOfWeek;
	}

	public static void main(String[] args) {

	}
}
