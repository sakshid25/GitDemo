package Sakshi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "hi");
		hm.put(10, "hello");
		hm.put(5, "me");
		System.out.println(hm);
		System.out.println(hm.get(5));
		System.out.println(hm.get(0)); //op: null as no key called 0 is present
		
		System.out.println(hm.remove(10));
		
		//entry set
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		//create hashtable and pass the table to set collection and print the values separately using iterator
		while(it.hasNext())
		{
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
			System.out.println(it.next());
		}
		
	}

}
