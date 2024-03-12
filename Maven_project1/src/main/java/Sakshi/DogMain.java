package Sakshi;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.setAge(5); //write only
		System.out.println(d.getAge()); // read only
		
		d.setAge(-5); //write only
		System.out.println(d.getAge()); // read only
		
		
		
	}

}
