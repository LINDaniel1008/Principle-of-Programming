import java.util.Scanner;
public class Lab5
{
	public static void main(String[] args)
	{
		final int PYRAMID = 1;
		final int TRIANGLE = 2;
		final int QUIT = 3;
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int size = 0;
		do
		{
		System.out.println("Please selcet an option::");
		System.out.println("1. Print a PYRAMID:");
		System.out.println("2. Print a TRIANGLE:");
		System.out.println("3. QUIT");
		choice = sc.nextInt();
		
		
		switch(choice)
		{
		
		case PYRAMID:
			System.out.println("Please enter the size:");
			size = sc.nextInt();
			int i, j;
			for(i = 0; i < size; i++)
			{
				for(j = 0; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			break;
		case TRIANGLE:
			System.out.println("Please enter the size:");
			size = sc.nextInt();
			for(i = 0; i < size; i++)
			{
				for(j = size - i;j>1 ; j--)
				{
					System.out.print(" ");
				}
				for(j = 0; j <= i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			break;
		case QUIT:
			System.out.println("Quitting the program as you requested...");
			break;
		default:
			System.out.println("Please choose again");
		}
		}while(choice != 3);
		sc.close();
	}
}
