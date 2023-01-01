import java.util.Scanner;
public class Lab11
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name = "";
		int marks;
		System.out.println("Enter the total number of Students");
		int num = scan.nextInt();
		
		Student[] students = new Student[num];
		final int max_marks = 4;
		for(int i = 0; i < num; i++)
		{
			System.out.println("Enter name and marks of student(" + (i+1) +")");
			name = scan.next();
			marks = scan.nextInt();
			students[i] = new Student(name, marks);
		}
		int choice;
		do{
			System.out.println("This program will do the following");
			System.out.println("1. Total marks");
			System.out.println("2. Update a student's marks");
			System.out.println("3. Swap marks");
			System.out.println("4. Find maximum marks");
			System.out.println("5. Exit");
			System.out.println("Give your choice for the above option");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("The sum of mark is "+ sum(students));
				break;
			case 2:
				System.out.println("Enter student name");
				name = scan.next();
				System.out.println("Enter new marks");
				int updated_marks = scan.nextInt();
				update(students, name, updated_marks);
				break;
			case 3:
				System.out.println("Enter first student's name :");
				String name1 = scan.next();
				System.out.println("Enter second student's name :");
				String name2 = scan.next();
				swap(students, name1, name2);
				break;
			case max_marks:
				System.out.println("Maximum marks obtained are: " + max(students));
				break;
			case 5:
				System.out.println("Exiting the program......");
				break;
			default:
				System.out.println("Invalid choce, try again!");
			}
		}while(choice !=5);
		 scan.close();

	}
	public static int sum(Student[] student_arr)
	{
		int sum = 0;
		for(int i = 0; i < student_arr.length; i++)
		{
			sum += student_arr[i].getMarks();
		}
		return sum;
	}
	public static void update(Student[] arr, String name, int val)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getName().equals(name))
			{
				arr[i].setMarks(val);
			}
		}
		print(arr);
	}
	public static void swap(Student[] arr, String name1, String name2)
	{
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getName().equals(name1))
			{
				index1 = i;
			
			}
			else if(arr[i].getName().equals(name2))
			{
				index2 = i;
			}
		}	
			int temp = arr[index1].getMarks();
			arr[index1].setMarks(arr[index2].getMarks());
			arr[index2].setMarks(temp);
			print(arr);
		
	}
	public static int max(Student[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getMarks() > max)
			{
				max = arr[i].getMarks();
			}
		}
		return max;
	}
	public static void print(Student[] arr)
	{
		System.out.println("The list is:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Name : " + arr[i].getName() + ", Marks : " + arr[i].getMarks());
		}
	}
	
}
