package eg1;

public class WhatsAppMain {

	public static void main(String[] args) {

		System.out.println("Accessing features using V3's object");
		WhatsAppV3 v3 = new WhatsAppV3();
		v3.groupConferenceVideoCall();
		v3.videoCall();
		v3.voiceCall();
		v3.voiceMessage();
		v3.textMessage();
		v3.groupMessage();
		System.out.println(v3.hashCode());
		System.out.println(v3.getClass());
		v3.setBackUp();
		v3.setStatus();

		System.out.println("\nAccessing features using V2's object");
		WhatsAppV2 v2 = new WhatsAppV2();
		// v2.groupConferenceVideoCall();
		// v2.videoCall();
		v2.voiceCall();
		v2.voiceMessage();
		v2.textMessage();
		v2.groupMessage();
		System.out.println(v2.hashCode());
		System.out.println(v2.getClass());
		// v2.setBackUp();
		v2.setStatus();

	}

}
