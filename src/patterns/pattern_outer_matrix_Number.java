// row Number 
package patterns;

public class pattern_outer_matrix_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i , j;
		int n=5;
		
		for(i=1;i<=n; i++)
		{
			for(j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print(i +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
