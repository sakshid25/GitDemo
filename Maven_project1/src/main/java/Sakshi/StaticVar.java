package Sakshi;

public class StaticVar {
	
	String name;
	String add;
	static String city="Mumbai";
	
	StaticVar(String name, String add)
	{
		this.name =name;
		this.add = add;
		
	}
	
	public void getadd()
	{
	System.out.println(add+" "+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("sak","boisar");
		StaticVar obj1= new StaticVar("ram","palghar");
		obj.getadd();
		obj1.getadd();
		
		
				
	}

}
