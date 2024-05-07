package Assessment;


public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=5;
		for (int i=k-1;i>=0;i--)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}