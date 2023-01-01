import java.util.Scanner;
public class Lab3
{
	public static void main(String[] args)
	{
		//double n2;
		//double n3;
		//double n4;
		//double ans;
		//double max;
		
		//String s1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input four integers on which we want to perform Mathematical Operations!");
		double n1,n2,n3,n4,ans=0,max,min;
		n1 = scanner.nextDouble();
		n2 = scanner.nextDouble();
		n3 = scanner.nextDouble();
		n4 = scanner.nextDouble();
		
		
		System.out.println("Please Input one of the following operations:");
		System.out.println("Type a to add the numbers.");
		System.out.println("Type b to Mul the numbers.");
		System.out.println("Type c to find Avg.");
		System.out.println("Type d to find Max.");
		System.out.println("Type e to find Min.");
		String s1 = scanner.next();

		if(s1.equals("a"))
		{
			ans = n1 + n2 + n3 + n4;
			System.out.println("Answer is :" + ans);
		}
		else if(s1.equals("b"))
		{
			ans = n1 * n2 * n3 * n4;
			System.out.println("Answer is :" + ans);
		}
		else if(s1.equals("c"))
		{
			ans = (n1 + n2 + n3 + n4)/4;
			System.out.println("Answer is :" + ans);
		}
		else if(s1.equals("d"))
		{
		    max = n1;
		    if(max < n2) {
		    	max = n2;
		    }
		    if(max < n3){
		    	max = n3;
		    }
		    if(max < n4){
		    	max = n4;
		    }
		    ans = max;
		    System.out.println("Answer is :" + ans);
		}
		else if(s1.equals("e"))
		{
		    min = n1;
		    if(min > n2){
		    	min = n2;
		    }
		    if(min > n3){
		    	min = n3;
		    }
		    if(min > n4){
		    	min = n4;
		    }
		    ans = min;
		    System.out.println("Answer is : " + ans);
		}
		else {
			System.out.println("Please input the correct option.");
		}
		System.out.println("We are comparing two strings and finding which one will come first in a dictionary!");
		System.out.println("Please enter 2 strings of length 4");
		String str1,str2;
		System.out.println("Enter string 1");
		str1 = scanner.next();
		System.out.println("Enter string 2");
		str2 = scanner.next();
		
		String first = "", second = "";
		
		if(str1.charAt(0) > str2.charAt(0)){
			first = str2;
			second = str1;
		}
		else if(str1.charAt(0) < str2.charAt(0)){
			first = str1;
			second = str2;
		}
		else if(str1.charAt(1) > str2.charAt(1)){
			first = str2;
			second = str1;
		}
		else if(str1.charAt(1) < str2.charAt(1)){
			first = str1;
			second = str2;
		}
		else if(str1.charAt(2) > str2.charAt(2)){
			first = str2;
			second = str1;
		}
		else if(str1.charAt(2) < str2.charAt(2)){
			first = str1;
			second = str2;
		}
		else if(str1.charAt(3) > str2.charAt(3)){
			first = str2;
			second = str1;
		}
		else if(str1.charAt(3) < str2.charAt(3)){
			first = str1;
			second = str2;
		}
		System.out.println("Fisrt String is : " + first );
		System.out.println("Second String is : " + second);
		scanner.close();
	}
}
