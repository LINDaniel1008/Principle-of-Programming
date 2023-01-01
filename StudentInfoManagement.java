import java.util.Scanner;
public class Lab7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input a username for student 1");
		String A = scan.next();
		System.out.println("Please input an age for student 1");
		int B = scan.nextInt();
		System.out.println("Please input a username for student 2");
		String C = scan.next();
		System.out.println("Please input an age for student 2");
		int D = scan.nextInt();
		
		Student student1 = new Student(A,B);
		Student student2 = new Student(C,D);
		int Print = 0;
		int Modify_Username = 1;
		int MOdify_Age = 2;
		int Quit = 3;
		int choice = 0;
		
		do
		{
		System.out.println("This program does the following:");
		System.out.println("0. Print inforamtion: ");
		System.out.println("1. Modify username:");
		System.out.println("2. Modify age:");
		System.out.println("3. Quit");
		choice = scan.nextInt();
		switch(choice)
		{
			case 0:
				student1.infor();
				student2.infor();
				break;
			case 1:
				System.out.println("Enter the student number that you wish to modify:(1/2)?:");
				int E = scan.nextInt();
				System.out.println("Please input the new name:");
				String F = scan.next();
				if(E == 1)
				{
					student1.setName(F);
					student2.infor();
				}
				else
				{
					student1.infor();
					student2.setName(F);	
				}
				break;
			case 2:
				System.out.println("Enter the student number that you wish to modify:(1/2)?:");
				int G = scan.nextInt();
				System.out.println("Please input the new age:");
				int H = scan.nextInt();
				if(G == 1) 
				{
					student1.setAge(H);
					student2.infor();	
				}
				else 
				{
					student1.infor();
					student2.setAge(H);
				}
				break;
			case 3:
				System.out.println("You choose to quit!");
				break;
			default:
				System.out.println("Please choose again");
		}
		}while(choice != 3);
	}
}
