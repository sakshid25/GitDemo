package Demo;

public class ChildEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.bodyColor();
		
	}

	public void bodyColor()
	{
		System.out.println("Blue");
	}
}

