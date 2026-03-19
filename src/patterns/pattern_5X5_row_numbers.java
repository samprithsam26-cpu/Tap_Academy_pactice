package patterns;

public class pattern_5X5_row_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i , j;
		int n = 5;

		for(i = 1; i <= n ; i++)
		{
			for(j = 0 ; j <= n; j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}
