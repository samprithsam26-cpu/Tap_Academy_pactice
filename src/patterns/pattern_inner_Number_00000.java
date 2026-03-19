//1 1 1 1 1
//1 0 0 0 1
//1 0 0 0 1
//1 0 0 0 1
//1 1 1 1 1

package patterns;

public class pattern_inner_Number_00000 {

	public static void main(String[] args) 
	{
		int i, j ;
		int n=5;
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
