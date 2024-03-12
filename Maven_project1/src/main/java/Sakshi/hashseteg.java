package Sakshi;

import java.util.HashSet;
import java.util.Iterator;

public class hashseteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("school");
		hs.add("frnds");
		hs.add("frnds");//does not accept duplicate
		hs.add("family");
		hs.add("home");
		System.out.println(hs);
		System.out.println(hs.remove("school"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		//Iterator
		Iterator<String> i = hs.iterator(); //hs is object for set
		System.out.println(i.next());
		
		//till index is present prints values from first to last
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
