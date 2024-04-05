package section14;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ava");
		names.add("susan");
		names.add("Aarav");
		names.add("Rewa");
		names.add("Aarvi");
		
		
		//to sort names starting with "A"
		
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//to print all the names with length>4 of ArrayList
		names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		//to limit
		names.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
		
		//print names which have last letter as 'a' with uppercase
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		

		Stream.of("Ava","Rewa","Kewa").filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		
		
		
	}

}
