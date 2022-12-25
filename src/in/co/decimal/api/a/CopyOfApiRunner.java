package in.co.decimal.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Vikas");
		names.add("Kumar");
		names.add("Basant");

		List<String> copyOfNames = List.copyOf(names);

		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
	}

	private static void doNotChange(List<String> copyOfNames) {
		copyOfNames.add("ShouldNotBeAllowed");

	}

}
