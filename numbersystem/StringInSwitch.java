package raghusir;

public class StringInSwitch {
	public static void main(String[] args) {
		String x="how are you?";
		switch (x) {
		case "hi":
			System.out.println("Hello");
			break;
		case "how are you?":
			System.out.println("I am fine,,");
			break;
		default:
			System.out.println("Default case executed.");
		}
	}
}
