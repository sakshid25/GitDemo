package Demo;


public class Construct {
	
	//does not return value
	public Construct() {
		System.out.println("I am a constructor");
		System.out.println("Sakshi");
	}
	
	//returns value
	public void method() {
		System.out.println("I am a method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct c = new Construct();
		c.method();
	}

}
