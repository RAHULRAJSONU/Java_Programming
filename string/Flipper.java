package stringfull;

public class Flipper {
	static String o="-";
	public static void main(String[] args) {
		switch ("FRED".toLowerCase().substring(1, 3)) {
		case "yellow":
			o +="yello";
		case "red":
			o+="red";
		case "re":
			o+="re";			
		default:
			System.out.println(o);
		}
	}
}
