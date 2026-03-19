package patterns;

public class pattern_numbers_01_to_25 {

	public static void main(String[] args) 
	{
		int i , j ;
		int n =5;
		int count=1;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n; j++)
			{
				if(count <= 9)
				{
					System.out.print("0");
				}
					System.out.print(count +" ");
					count++;
			}
			System.out.println();
		}

	}

}
