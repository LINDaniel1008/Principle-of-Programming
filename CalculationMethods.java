import java.util.*;
public class Assignment6 {
   public static void main (String[] args) {

       Scanner console = new Scanner (System.in);
       String choice;
	   char command;

	   // numbers used for input in the various cases
	   int num1, num2,num3, num4;
	   num3 = 0;
	   num4 = 1;

	   // print the menu
	   System.out.println("*** Start of Program ***");
	   printMenu();

	   // **********************************//
	   // *** Construct a Fraction instance here *** //
	   Fraction fraction = new Fraction(num3, num4);
	   System.out.print("Value:" + fraction.toString());
	   // **********************************//

	   do
	   {
		   // ask a user to choose a command
		   System.out.println("\n[Please enter a command or type ?] ");
		   choice = console.next().toLowerCase();
		   command = choice.charAt(0);

		   switch (command)
			{
				case 'c':
					// *****************************//
					// *** Reset Fractions here *** //
					Fraction f = new Fraction(0,1);
					System.out.println("Value:" + f.toString());
					fraction = f;
	   				// *****************************//
		            break;
				case '*':
					System.out.println("[Enter two numbers for a fraction to MULTIPLY] ");
					// **************************************//
					// *** Call Fraction Multiply Method *** //
					num1 = console.nextInt();
					num2 = console.nextInt();
					Fraction c = new Fraction(num1,num2);
					System.out.println(fraction.toString()+ " * "+ c.toString()+ " = " + Fraction.multiply(fraction,c));
					System.out.println("Value:" + Fraction.multiply(fraction,c));
					fraction = Fraction.multiply(fraction,c);
					
	   				// **************************************//
					break;
				case '/':
					System.out.println("[Enter two numbers for a fraction to DIVIDE] ");
					// ************************************//
					// *** Call Fraction Divide Method *** //
					num1 = console.nextInt();
					num2 = console.nextInt();
					Fraction g = new Fraction(num1, num2);
					System.out.println(fraction.toString()+ " / "+ g.toString()+ " = " + Fraction.divide(fraction,g));
					System.out.println("Value:" + Fraction.divide(fraction,g));
					fraction = Fraction.divide(fraction,g);
	   				// ************************************//

					break;
				case '+':
					System.out.println("[Enter two numbers for a fraction to ADD] ");
					// *********************************//
					// *** Call Fraction Add Method *** //
					num1 = console.nextInt();
					num2 = console.nextInt();
					Fraction d = new Fraction(num1, num2);
					System.out.println(fraction.toString()+ " + "+ d.toString()+ " = " + Fraction.add(fraction,d));
					System.out.println("Value:" + Fraction.add(fraction,d));
					fraction = Fraction.add(fraction,d);
					// *********************************//
					break;
				case '-':
					System.out.println("[Enter two numbers for a fraction to SUBTRACT] ");
					// **************************************//
					// *** Call Fraction Subtract Method *** //
					num1 = console.nextInt();
					num2 = console.nextInt();
					Fraction e = new Fraction(num1, num2);
					System.out.println(fraction.toString()+ " - "+ e.toString()+ " = " + Fraction.subtract(fraction,e));
					System.out.println("Value:" + Fraction.subtract(fraction,e));
					fraction = Fraction.subtract(fraction,e);
					// **************************************//
					break;
				case '?':
					 printMenu();
					 break;
				case 'q':
					 break;
				default:
					 System.out.println("[Invalid input] " + command);
					 break;
			}
		} while (command != 'q');
		 System.out.println("*** End of Program ***");
		 console.close();
	}  //end of the main method


   public static void printMenu()
   {
	System.out.print(
				   "\nCommand Options\n"
				   +"-----------------------------------\n"
				   +"c: reset the value\n"
				   +"+: add a fraction to the current value\n"
				   +"-: subtract a fraction from the current value\n"
				   +"*: multiply a fraction to the current value\n"
				   +"/: divide the current value by a fraction\n"
				   +"?: display the menu again\n"
				   +"q: quit this program\n\n");
	} // end of the printMenu method
}

