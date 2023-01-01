import java.util.Scanner;
public class Lab8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size;
		int[] arr;
		arr = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Please enter the value for index" + i);
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		int sum = 0;
		for(int i = 0; i < 5; i++ )
		{
			sum = sum + arr[i];
			System.out.println("Value at index" + " " + i + ": " + arr[i]);
		}
		System.out.println("The sum of all the elements of the array: " + sum);
		int rem = arr[0];
		for(int i = 0; i < arr.length - 1; i++)
		{
			arr[i] = arr[i+1];
		}
		
		arr[arr.length - 1] = rem;
		System.out.println("Array after left rotation:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Value at index" + " " + i + ": " + arr[i]);
		}
		sc.close();
	}
}
