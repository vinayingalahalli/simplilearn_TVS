package custome_exception_example;

public class CustomMain {

	public static void main(String[] args) {

		Validation v = new Validation();
		try {
			if (v.isValidAge(-34)) {
				System.out.println("Age Validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
			if (v.isValidPan("ABCEE1122A")) {
				System.out.println("Pan Validated");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

	}

}
