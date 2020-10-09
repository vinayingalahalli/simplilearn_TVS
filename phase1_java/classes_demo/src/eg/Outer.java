package eg;

public class Outer {

	public void outerMethod() {
		InnerPrivate i = new InnerPrivate();
		i.innerPrivateMethod();
	}

	private class InnerPrivate {
		public void innerPrivateMethod() {
			System.out.println("Hello innerPrivateMethod()");
		}
	}

	protected class InnerProtected {

	}

	public class InnerPublic {
		public void helloInnerPublic() {
			System.out.println("Hello from InnerPublic method");
		}
	}

	public static class InnerPublicStatic {
		public static void helloInnerPublicStatic() {
			System.out.println("Static method of InnerPublicStatic");
		}

		public void helloInnerPublicStaticNonStatic() {
			System.out.println("Non Static method of InnerPublicStatic");
		}
	}
}
