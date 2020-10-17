package eg1;

public  class  MobileV1 {

	public void calling() {
		System.out.println("Calling feature from V1");
	}
	
	public void sendMessage() {
		System.out.println("Messaging feature from V1");
	}
	
	 void displayMenu() {
		System.out.println("Menu in V1 gets displayed in LIST view");
	}
}

//public -> protected -> default -> private

//anything which is private, which is static or
//which is final cannot be overridden.