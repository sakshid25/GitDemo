package Assessment;

import java.util.*;

public class sortHsahmap {
 
    // This map stores unsorted values
    static HashMap<Integer, String> hm = new HashMap<>();
 
    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        hm.put(25, "susan");
        hm.put(5, "ava");
        hm.put(1, "rohit");
        hm.put(99, "susy");
        hm.put(9, "kewa");
 
        // Calling the function to sortMapByKey to
        // perform sorting based on keys
        sortMapByKey();
    }

// Function to sort map by Key
    public static void sortMapByKey()
    	{
    		ArrayList<Integer> sortKeys = new ArrayList<Integer>(hm.keySet());	//converts keys in hashmap into set

    		Collections.sort(sortKeys);

    		// Getting value for each key and displaying results
    		for (Integer k : sortKeys)
    			System.out.println("Key = " + k + ", Value = " + hm.get(k));
    	}

}