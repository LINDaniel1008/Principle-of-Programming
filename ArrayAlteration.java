import java.util.Scanner;
public class Lab9
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Create an Array of 10 integers.");
		int[] ints = new int[10];
		System.out.println("Insert 8 integers into the Array.");
		for(int i = 0; i < 8; i++)
		{
			ints[i]= in.nextInt();
		}
		System.out.print("Values in array are ");
		for(int i = 0 ;i < 8; i++)
		{
			System.out.print(ints[i] + ",");
		}
		System.out.println("");
		System.out.println("Enter which location you want to insert:");
		int loc = in.nextInt(); //loc is not index
		System.out.println("Enter which value you want to insert:");
		int value = in.nextInt();
		for(int i = 7; i >= loc-1; i--)
		{
			ints[i+1] = ints[i];
		}
		ints[loc - 1] = value;
		System.out.print("Values in array are ");
		for(int i = 0 ; i < 9; i++)
		{
			System.out.print(ints[i] + ",");
		}
		System.out.println("");
		System.out.println("Enter which location you want to delete:");
		int loc3 = in.nextInt();
		for(int i = loc3-1; i < 8; i++)
		{
			ints[i] = ints[i+1];
		}
		System.out.print("Values in array are ");
		for(int i = 0; i < 8; i++)
		{
			System.out.print(ints[i] + ",");
		}
		System.out.println("");
		System.out.println("Enter first swap location");
		int loc1 = in.nextInt();
		System.out.println("Enter first swap location");
		int loc2 = in.nextInt();
		int temp = ints[loc1 - 1];
		ints[loc1 - 1] = ints[loc2 - 1];
		ints[loc2 - 1 ] = temp;
		System.out.print("Values in array are ");
		for(int i = 0; i < 8; i++)
		{
			System.out.print(ints[i] + ",");
		}
		System.out.println("");
		in.close();
	}
	
}
