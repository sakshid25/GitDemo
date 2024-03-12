package Sakshi;

public class Dog {
	
	private String color;
	private int age;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>0)
			this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
