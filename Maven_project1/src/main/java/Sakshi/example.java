package Sakshi;

public class example {
	
	public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5};
	
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]);
	}
	
	String s1 = "Sakshi Dhanmeher ";
	String s2 = "Dhanmeher";
	
	String result = s1 + " " + s2;
	System.out.println(result);
	
	String[] SplittedString = s1.split(" ");
	System.out.println(SplittedString[0]);
	System.out.println(SplittedString[1]);
	

}
}

