package loops_pkg;

public class Sample1 
{
	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) 
		{
			for(int j=row;j>i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=row;k++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
