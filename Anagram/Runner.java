package raghusir.anagram;

public class Runner {
	public static void main(String[] args) {
		Anagram ag=new Anagram();
		System.out.println(ag.compareString(ag.toLower(ag.removeSpace("Rahul raj sonu")), ag.removeSpace("rahul raj sonu")));
	}
}
