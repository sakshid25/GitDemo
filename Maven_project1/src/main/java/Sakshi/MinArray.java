package Sakshi;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{0,5,6},{8,9,2}};
		int min=a[0][0];
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
