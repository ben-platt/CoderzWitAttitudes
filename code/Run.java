// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

import java.util.Scanner;
//import java.io.File;

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

	// CREATING THE PLAYER
	System.out.println("ISLAND SURVIVAL GAME");
	System.out.println("Input Age (in years) : ");
	String input = scanner.nextLine();
	int inputAge = Integer.parseInt( input );
	player.setAge( inputAge );
	System.out.println("Input Height (in inches) : ");
	input = scanner.nextLine();
	int inputHeight = Integer.parseInt( input );
	player.setAge( inputHeight );
	System.out.println("Input Weight (in pounds) : ");
	input = scanner.nextLine();
	int inputWeight = Integer.parseInt( input );
	player.setAge( inputWeight );
	System.out.println("You find yourself stranded on a Tropical Island.");
	System.out.println("You have " + player.getHealth() + " health.");
	System.out.println("What will you do now?");
	int code = mainMenu(scanner);

    } // end of main method

} // end of class Run
