package Demo;

class Animal1 {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal1 {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal1 {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
	
	//has many versions of animalSound method but prioritizes local one.
public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.animalSound();
		
	}

}

