package Sakshi;

public class demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Basic
		int Num =5;
		boolean value = true;
		System.out.println(Num+"is the variable");
		System.out.println(value);
		
		
		
		int[] arr1 = {0,11,12,13};
		System.out.println(arr1[2]);
		
		//for loop
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		//string array for loop
		String[] name = {"sakshi", "selenium"};
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		//enhanced for loop
		for (String s:name)
		{
			System.out.println(s);
		}
	}

}
