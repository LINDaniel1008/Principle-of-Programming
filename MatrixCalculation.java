import java.util.Scanner;
public class Lab10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][]mat_A = new int[4][4];
		int [][]mat_B = new int[4][4];
		int [][]mat_C = new int[4][4];
		int [][]mat_D = new int[4][4];
		System.out.println("Enter values into mat_A:");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++ )
			{
				mat_A[i][j] = sc.nextInt();
				System.out.print(mat_A[i][j] + "\t");

			}
			System.out.print("\n");
	
		}
		System.out.println("Enter values into mat_B:");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++ )
			{
				mat_B[i][j] = sc.nextInt();
				System.out.print(mat_B[i][j] + "\t");

			}
			System.out.print("\n");
	
		}
		System.out.println("Addition of two matrices: Matrix C is ");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++ )
			{
				mat_C[i][j] = mat_A[i][j] + mat_B[i][j];
				System.out.print(mat_C[i][j] + "\t");

			}
			System.out.print("\n");

				
		}
		System.out.print("Sum of elements of matrix C is ");
		int Sum = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++ )
			{
				Sum = Sum + mat_C[i][j];
			}
		}
		System.out.println(Sum);
		System.out.println("Tranpose of matrix C is");
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++ )
			{
				mat_D[i][j] = mat_C[j][i];
				System.out.print(mat_D[i][j] + "\t");

			}
			System.out.print("\n");
	
		}sc.close();
		
	}
}
