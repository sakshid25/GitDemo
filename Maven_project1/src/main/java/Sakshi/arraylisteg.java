package Sakshi;

import java.util.ArrayList;

public class arraylisteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>(); //dynamic size array
		a.add("Sakshi");
		a.add("Sakshi"); // can accept duplicate values
		a.add("Saksham");
		System.out.println(a);
		a.add(1, "school");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		/*a.remove("Sakshi");
		System.out.println(a);*/
		
		a.get(1);
		System.out.println(a);
		//testing
		System.out.println(a.contains("sakshi"));//returns true or false and is case sensitive
		
		System.out.println(a.indexOf("Saksham"));
		System.out.println(a.isEmpty()); //returns true or false
		System.out.println(a.size());
		
	}

}
