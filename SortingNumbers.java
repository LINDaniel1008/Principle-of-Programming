import java.util.Scanner;
public class Assignment2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String a, b, c, first, second, third;
		
		System.out.println("Please input the first name:");
		a= scanner.next();
		a = a.toUpperCase();
		if(a.compareTo("A") >= 0 && a.compareTo("Z") <= 0)
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println("Error: The first letter should be an alphabet");
			a = "";
		}
		
		
		System.out.println("Please input the second name:");
		b = scanner.next();
		b = b.toUpperCase();
		if(b.compareTo("A") >= 0 && b.compareTo("Z") <= 0)
		{
			b = b;
		}
		else 
		{
			System.out.println("Error: The first letter should be an alphabet");
			b = "";
		}
		if(a.compareTo(b) > 0)
			System.out.println(b+","+" "+a);
		else
			System.out.println(a+","+" "+b);
		
		
		System.out.println("Please input the third name:");
		c = scanner.next();
		c = c.toUpperCase();
		if(c.compareTo("A") >= 0 && c.compareTo("Z") <= 0)
		{
			c = c;
		}
		else 
		{
			System.out.println("Error: The first letter should be an alphabet");
			c = "";
		}
		if(a.compareTo(b) > 0) {first = b; third = a;}
		else {first = a; third = b;}
		if(c.compareTo(third) > 0 ){second = third; third = c;}
		else if(c.compareTo(first) < 0){second = first; first = c;}
		else{second = c;}
		
		System.out.println(first+","+" "+second+","+" "+third);
		scanner.close();
	}
}
