package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ava");
		names.add("susan");
		names.add("Aarav");
		names.add("Rewa");
		names.add("Aarvi");
		
		List<String> names1 =Arrays.asList("Rohan","Riya","Aarav");
		//print names which have first letter as 'a' with uppercase and sorted
		names1.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merging 2 different lists
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println());
	}

}

