import java.util.Scanner;
public class Assignment4{

	public static void main(String[] args) {
		char command;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Choose (A: new),  (B:changeOne), (C:Display), or (Q: quit)");
		String str1 = scan.next();
		command = str1.charAt(0);
		if (command == 'A') {
			System.out.println("*** Make A new FiveCards ***");
			System.out.println("Type five letters without space");
			String str = scan.nextLine();
			FiveCards myCards = new FiveCards();
			myCards.setCards(str);
			myCards.CalculateScore();
			System.out.println(myCards.displayData());
		}
		else if (command == 'B') {
			System.out.println("*** Change One Card ***");
			System.out.println("Type one position to change");
			int pos = scan.nextInt();
			String lineBreak = scan.nextLine();
			FiveCards myCards = new FiveCards();
			myCards.changeOne(pos);
			myCards.CalculateScore();
			System.out.println(myCards.displayData());
			
			
		}
		else if (command == 'C') {
			System.out.print("Display Data");
			FiveCards myCards = new FiveCards();
			System.out.println(myCards.displayData());
			
		}
		else if (command == 'Q') {
			System.out.println("*** End of Program ***");
		}
		else {
			System.out.println("*** Invalid command. Try Again ***");
		}
		}while(command != 'Q');
	}
}
