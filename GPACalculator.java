import java.util.Scanner;
public class Assignment3{
	public static void main(String[] args){
		char command;
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		float d = 0;
		do{
			System.out.println("Choose (A: add grades), (N: new grades), or (Q: quit)");
			String temp = in.nextLine();
			command = temp.toUpperCase().charAt(0);
			
			if (command == 'A') {
				System.out.println("Type the additional input in single line");
				
                temp = in.nextLine();
                Scanner s = new Scanner(temp);
				while (s.hasNext()){
					String input = s.next();
					if(input.equals("A")) a++;
					else if(input.equals("B")) b++;
					else if(input.equals("C")) c++;
					d =(float)(4*a+ 3*b +2*c)/(a+b+c);
					
				}
				int i;
				System.out.print("A|");
				for(i=a;i>0;i--) {
					System.out.print("* ");
				}
				System.out.println("");
				int j;
				System.out.print("B|");
				for(j=b;j>0;j--) {
					System.out.print("* ");
				}
				System.out.println("");
				int k;
				System.out.print("C|");
				for(k=c;k>0;k--) {
					System.out.print("* ");
				}
				System.out.println("");
				System.out.print("GPA = ");
				System.out.printf("%.2f", d);
				System.out.println("");
			}
			else if (command == 'N') {
				System.out.println("Type a new list of input in single line");
				a = 0;
				b = 0;
				c = 0;
				d = 0;
                temp = in.nextLine();
                Scanner s = new Scanner(temp);
				while (s.hasNext()){
					String input = s.next();
					if(input.equals("A")) a++;
					else if(input.equals("B")) b++;
					else if(input.equals("C")) c++;
					d =(float)(4*a+ 3*b +2*c)/(a+b+c);
				}
				int i;
				System.out.print("A|");
				for(i=a;i>0;i--) {
					System.out.print("* ");
				}
				System.out.println("");
				int j;
				System.out.print("B|");
				for(j=b;j>0;j--) {
					System.out.print("* ");
				}
				System.out.println("");
				int k;
				System.out.print("C|");
				for(k=c;k>0;k--) {
					System.out.print("* ");
				}
				System.out.println("");
				System.out.print("GPA = ");
				System.out.printf("%.2f", d);
				System.out.println("");
			}
			else if (command == 'Q') {
				System.out.println("*** End of program ***");
			}
			else {
				System.out.println("Invalid command was input!");
			}
		}while(command != 'Q');
		
	}
		
}
