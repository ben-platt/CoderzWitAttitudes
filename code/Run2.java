// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

import java.util.Scanner;
//import java.io.File;

public class Run2 {

    public static int mainMenu(Scanner scanner) {

	int code = -1;
	String choice = "";
	while(true) {
	    System.out.println("1. Go to Shelter\n2. Hunt\n3. Gather Plants\n4. Fish\n5. Eat");
	    choice = scanner.nextLine();
	    if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5") ) {
		code = Integer.parseInt(choice);
		break;
	    } else {
		System.out.println("Invalid Option! Try again!");
	    }
	}
	return code;
    }

    public static void main( String[] args ) {

	Island island = new Island();
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
	// STARTING THE GAME
	System.out.println("You find yourself stranded on a Tropical Island.");
	System.out.println("You have " + player.getHealth() + " health.");
        while( player.getHealth() != 0 ) {

	    System.out.println("What will you do now?");
	    int code = mainMenu(scanner);

	    if ( code == 1 ) {
		// SHELTER
		if ( player.hasShelter() ) {
		    while(true) {
			System.out.println("What will you do?");
			System.out.println("1. Sleep\n2. Exit shelter");
			input = scanner.nextLine();
			if ( input == "1" ) {
			    player.sleep();
			    break;
			}
			else if ( input == "2" ) {
			    break;
			}
		    }
		}
		else {
		    while(true) {
			System.out.println( "You don't have a shelter!" );
			System.out.println("What will you do?");
			System.out.println("1. Build a Shelter\n2. Nevermind...");
			input = scanner.nextLine();
			if ( input == "1" ) {
			    player.buildShelter(); // this dont work...

          break;
			}
			else if ( input == "2" ) {
			    break;
			}
		    }
		}

	    }
	    else if ( code == 2 ) {
		// HUNT
	        player.attack();
	    }
	    else if ( code == 3 ) {
		// GATHER
	    }
	    else if ( code == 4 ) {
		// FISH
      if(player.hasFishNet()){
          player.fish();
          break;
      }

	    }
	    else if ( code == 5 ) {
		// EAT

		}


	    //break;

	}

    } // end of main method

} // end of class Run
