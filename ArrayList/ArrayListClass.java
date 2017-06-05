package arrray_list;

import java.util.*;

public class ArrayListClass {
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("Delhi");
		s.add("Nagpur");
		s.add("Panipat");
		System.out.println(s+" "+s.indexOf("Nagpur"));
		s.add(1, "Bangalore");
		System.out.println(s);
		s.clear();
		System.out.println(s);
		s.add("rahul");
		s.add("raj");
		System.out.println(s);
		s.add(0, "Mr.");
		System.out.println(s);
		System.out.println(s.contains("Mr.")+" "+ s.contains("raj"));
		System.out.println("size: "+s.size()+" contains: "+s);
		
	}

}
