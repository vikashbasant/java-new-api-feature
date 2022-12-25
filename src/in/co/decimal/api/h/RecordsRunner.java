package in.co.decimal.api.h;

public class RecordsRunner {

	// this is nothing but records:
	// this will atomic create all constructor, toString and other things:
	record Person(String name, String email, String phoneNumebr) {
	}

	// create custom records:
	record PersonCustom(String name, String email, String phoneNumber) {

		PersonCustom(String name, String email, String phoneNumber) {
			// here this is nothing but validation:
			if (name == null) {
				throw new IllegalArgumentException("Here name is null");
			}
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}
	}

	record PersonCompacteConstructor(String name, String email, String phoneNumber) {
		// This is know compact constructor:
		PersonCompacteConstructor {
			// here this is nothing but validation:
			if (name == null) {
				throw new IllegalArgumentException("Here name is null");
			}
		}

		// non-static instance method are allowed in records:
		// but non-static instance variable are not allowed:
		public String name() {
			System.out.println("own logic");
			return name;
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Vikash", "basantvikash360@gmail.com", "878-978-2803");
		Person person1 = new Person("Vikash", "basantvikash360@gmail.com", "878-978-2803");
		Person person2 = new Person("Vikash1", "basantvikash361@gmail.com", "878-978-2804");

		// equals method:
		System.out.println(person.equals(person1));

		System.out.println(person.equals(person2));

		// get name():
		System.out.println(person.name()); // Vikash
	}
}
