import java.util.*;
public class Assignment7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String choice;
		char command;
		int j = 13; // length of array
		CardList f3 = new CardList(j);
		do
		{
		System.out.println("\nPlease enter a command or type ? ");
		choice = scan.next().toLowerCase();
		command = choice.charAt(0);


			switch(command)
			{
			case 'a':
				System.out.println("Input the size of cards");
				int d = scan.nextInt();
				CardList f1 = new CardList(d);
				System.out.println(f1.getHistory());
				f3 = f1;
				j = d;
				break;
		
			case 'b':
				f3.flip();
				break;
			case 'c':
				f3.shift();
				break;
			
			case 'd':
				f3.shuffle();
				break;
			case 'e':
				System.out.println("Input the number of cards to change");
				int c = scan.nextInt();
				f3.change(c);
				break;
			case '?':
				printMenu();
				break;
			case 'q':
				System.out.println("*** End of Program ***");
				break;
			default:
				 System.out.println("[Invalid input] " + command);
				 break;
			}
		}while(command != 'q');
		 scan.close();
	}
	public static void printMenu()
	{
		System.out.print(
						"\nCommand Options\n"
						+"-------------------------------\n"
						+"a: Create new cards\n"
						+"b: flip the cards\n"
						+"c: shift the card\n"
						+"d: shuffle the cards\n"
						+"e: change the cards\n"
						+"?: Display the menu again\n"
						+"q: Quit this program");
				
	}
}
