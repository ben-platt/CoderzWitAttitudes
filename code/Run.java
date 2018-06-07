// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

import java.util.Scanner;

public class Run {

    public static int mainMenu(Scanner scanner) {
		
	int code = -1;		
	String choice = "";
	while(true) {
	    System.out.println("1. Go to Shelter\n2. Hunt\n3. Gather Plants\n4. Fish");
	    choice = scanner.nextLine();		
	    if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
		code = Integer.parseInt(choice);
		break;
	    } else {
		System.out.println("Invalid Option! Try again!");
	    }
	}
	return code;
    }
    public static void main( String[] args ) {

	Player player = new Player();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Input");
	System.out.println("You find yourself stranded on a Tropical Island.");
	System.out.println("What will you do now?");
	int code = mainMenu(scanner);


    } // end of main method

} // end of class Run
