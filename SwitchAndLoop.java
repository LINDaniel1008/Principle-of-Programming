import java.util.Scanner;
public class Lab4
{
	public static void main(String[] args)
	{
		
		final int SUM = 1;
		final int FACTORIAL = 2;
		final int FACTORS = 3;
		final int QUIT = 4;
		int n1 = 0;
		System.out.println("This program does the following:");
		System.out.println("1.Sum of numbers from 1 to n");
		System.out.println("2.Factorial of n");
		System.out.println("3.Factors of n");
		System.out.println("4.Quit");
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Please choose an option");
			n1 = sc.nextInt();
			switch(n1)
			{
				case SUM:
				{
					System.out.println("Please enter an integer n:");
					int n = sc.nextInt();
					int ans;
					ans = (1 + n) * n / 2;
					System.out.println("Sum of numbers from 1 to " + n + " is " + ans);
					break;
				}
				case FACTORIAL:
				{
					System.out.println("Please enter an integer n");
					int n = sc.nextInt();
					int fact = 1;
					for(int i = n; i > 1 ;i--)
					{
							fact = fact * i;
					}
					System.out.println("Factorial of number " + n + " is " + fact);
					break;
				}
				case FACTORS: 
				{
					System.out.println("Please enter an integer n");
					int n = sc.nextInt();
					System.out.println("Factors of number " + n +" are");
					for(int i = 1; i <= n;++i)
					{
						if(n % i == 0)
						{
							System.out.print(i + " ");
						}
					}
					System.out.println("");
					break;
				}
				case QUIT:
				{
					System.out.println("Your choice was <QUIT>, Quitting the program, Have a good day!");
					break;
					}
				default:
				{
					System.out.println("Incorrect choice, " + n1 + " Please choose again");
					break;
				}	
			}
				
		}while(n1 != QUIT);
	}
}
