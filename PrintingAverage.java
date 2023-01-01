import java.util.Scanner;
public class Lab2
{
	public static void main(String[] args)
	{
		int age;
		age = 21;
		String firstName,lastName,fullName;
		firstName = "CHUNTING";
		lastName = "LIN";
		fullName = "CHUNTING LIN";
		System.out.println(firstName +" is "+age+ " years old");
		System.out.println(fullName);
		
		System.out.println("Input integer value for n1,n2,n3,n4");
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();	
		double avg;
		avg = (float)(n1+n2+n3+n4)/4;
		
	
		System.out.println("The value of n1 is :"+n1);
		System.out.println("The value of n2 is :"+n2);
		System.out.println("The value of n3 is :"+n3);
		System.out.println("The value of n4 is :"+n4);
		System.out.println("The average of the four number is :"+avg);
			
	

	
			
	
	
			
	}
}
