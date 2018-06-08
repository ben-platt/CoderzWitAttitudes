// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

import java.util.Scanner;
import java.util.ArrayList;

public class Woo {

    public static int mainMenu(Scanner scanner) {

	int code = -1;
	String choice = "";
	while(true) {
	    System.out.println("1. Go to Shelter\n2. Hunt\n3. Gather Plants\n4. Fish\n5. Eat\n6. List Items");
	    choice = scanner.nextLine();
	    if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5") || choice.equals("6") ) {
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
	// STARTING THE GAME
	System.out.println("You find yourself stranded on a Tropical Island.");
        while( player.getHealth() != 0 ) {

	    player.setHealth( player.getHealth() - 2 );
	    System.out.println("You have " + player.getHealth() + " health.");
	    for( int i = 0; i < player.getIsland().getNumPlants(); i++ ) {
		player.getIsland().getPlants().get(i).photosynthesize();
	    }

	    System.out.println("What will you do now?");
	    int code = mainMenu(scanner);

	    if ( code == 1 ) {
		// SHELTER
		if ( player.hasShelter() ) {
		    while(true) {
			System.out.println("What will you do?");
			System.out.println("1. Sleep\n2. Exit shelter");
			input = scanner.nextLine();
			if ( input.equals("1") ) {
			    player.sleep();
			    break;
			}
			else if ( input.equals("2") ) {
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
			if ( input.equals("1") ) {
			    player.buildShelter();
			    break;
			}
			else if ( input.equals("2") ) {
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
		// Generate a Random Plant from the Island
		ArrayList<Plant> plantList = player.getIsland().getPlants();
		int random = (int) ( Math.random() * plantList.size() );
		Plant fionaPlant = plantList.get(random);
		System.out.println("You found a " + fionaPlant.getName() + "!");
		// Plants that have Queues
		if ( fionaPlant.getName().equals("Tree") || fionaPlant.getName().equals("GuavaTree") || fionaPlant.getName().equals("PalmTree") || fionaPlant.getName().equals("ThimbleBush") ) {
		    while(true) {
			System.out.println("What will you do?");
			System.out.println("1. Pluck\n2. Leave");
			Item kayliItem = new Item();
			input = scanner.nextLine();
			if ( input.equals("1") ) {
			    while(true) {
				kayliItem = fionaPlant.pluck();
				System.out.println("What will you do with this " + kayliItem.getName() + "?");
				System.out.println("1. Add to Items and Leave\n2. Add to Items and Pluck Again\n3. Pluck Again\n4. Leave");
				input = scanner.nextLine();
				if ( input.equals("1") ) {
				    player.addItem( kayliItem );
				    break;
				}
				else if ( input.equals("2") ) {
				    player.addItem( kayliItem );
				    if ( fionaPlant.getQueue().isEmpty() ){
					System.out.println("Nothing left to pluck!");
				    break;
				}
				}
				else if ( input.equals("3") ) {
				    // go again!
				}
				else if ( input.equals("4") ) {
				    break;
				}
			    }
			    break;
			}
			else if ( input.equals("2") ) {
			    break;
			}
		    }
		}
		else {
		    System.out.println( "What will you do with this " + fionaPlant.getName() + "?");
		    Item kayliItem = fionaPlant;
		    System.out.println("1. Gather\n2. Leave");

		    input = scanner.nextLine();
		    if ( input.equals("1") ) {
			 player.addItem( kayliItem );
		    }
		    else {
			// Leave
		    }
		}
	    }
	    else if ( code == 4 ) {
		// FISH
    if(player.hasFishNet()){
    player.fish();
    break;
}
else{
  while(true){
    System.out.println("You don't have a fishnet!");
    System.out.println("What will you do?");
    System.out.println("1. Build a Fishnet\n2. Nevermind...");
    input = scanner.nextLine();
    if(input.equals("1") ){
      player.buildFishNet();
      break;
    }
    else if(input.equals("2")){
      break;
    }
  }
	    }
    }
	    else if ( code == 5 ) {
		// EAT
		while(true) {
		    System.out.println("What do you want to eat?");
		    System.out.println("1. A Plant Food\n2. An Animal Food\n3. Nevermind...");
		    input = scanner.nextLine();
		    if ( input.equals("1") ) {
			if ( player.getPlantFood().equals("Sorry you have no plants to eat") ) {
			    System.out.println( player.getPlantFood() );
			}
			else {
			    while(true) {
				System.out.println("Which plant will you eat?");
				String plants = player.getPlantFood();
				int start = 0;
				int end = plants.length();
				ItemNode currentItem = player.getItems()._start;
				String inputBreed = "";
				System.out.println( plants );
				input = scanner.nextLine();
				if ( input.equals("1") ) {
				    end = plants.indexOf( "n", start );
				    inputBreed = plants.substring( start, end-1 );
				    System.out.println( inputBreed );
				    while( !currentItem.getContents().equals(inputBreed) ){
					currentItem = currentItem.getNext();
				    }
				    player.eatPlant( currentItem.getItem().peek() );
				    break;
				}
				else if ( input.equals("2") ) {
				    if ( plants.contains( input ) ) {
					start = plants.indexOf( input, 0 ) + 3;
					end = plants.indexOf( "\\", start );
					inputBreed = plants.substring( start, end );
					while( !currentItem.getContents().equals(inputBreed) ){
					    currentItem = currentItem.getNext();
					}
					player.eatPlant( currentItem.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
				else if ( input.equals("3") ) {
				    if ( plants.contains( input ) ) {
					start = plants.indexOf( input, 0 ) + 3;
					end = plants.indexOf( "\\", start );
					inputBreed = plants.substring( start, end );
					while( !currentItem.getContents().equals(inputBreed) ){
					    currentItem = currentItem.getNext();
					}
					player.eatPlant( currentItem.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
				else if ( input.equals("4") ) {
				    if ( plants.contains( input ) ) {
					start = plants.indexOf( input, 0 ) + 3;
					end = plants.indexOf( "\\", start );
					inputBreed = plants.substring( start, end );
					while( !currentItem.getContents().equals(inputBreed) ){
					    currentItem = currentItem.getNext();
					}
					player.eatPlant( currentItem.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
				else if ( input.equals("5") ) {
				    if ( plants.contains( input ) ) {
					start = plants.indexOf( input, 0 ) + 3;
					end = plants.indexOf( "\\", start );
					inputBreed = plants.substring( start, end );
					while( !currentItem.getContents().equals(inputBreed )){
					    currentItem = currentItem.getNext();
					}
					player.eatPlant( currentItem.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
			    }
			}
		    }
		    else if ( input.equals("2") ) {
			if ( player.getAnimalFood().equals("Sorry you have no animals to eat") ) {
			    System.out.println( player.getAnimalFood() );
			}
			else {
			    while(true) {
				System.out.println("Which animal will you eat?");
				String animals = player.getAnimalFood();
				int starta = 0;
				int enda = 0;
				ItemNode currentItema = player.getItems()._start;
				String inputBreeda = "";
				System.out.println( animals );
				input = scanner.nextLine();
				if ( input.equals("1") ) {
				    enda = animals.indexOf( "\\", starta );
				    inputBreeda = animals.substring( starta, enda );

				    while( !currentItema.getContents().equals(inputBreeda) ){
					currentItema = currentItema.getNext();
				    }
				    player.eatAnimal( currentItema.getItem().peek() );
				    break;
				}
				else if ( input.equals("2") ) {
				    if ( animals.contains( input ) ) {
					starta = animals.indexOf( input, 0 ) + 3;
					enda = animals.indexOf( "\\", starta );
				        inputBreeda = animals.substring( starta, enda );
					while( !currentItema.getContents().equals(inputBreeda) ){
					    currentItema = currentItema.getNext();
					}
					player.eatAnimal( currentItema.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
				else if ( input.equals("3") ) {
				    if ( animals.contains( input ) ) {
					starta = animals.indexOf( input, 0 ) + 3;
					enda = animals.indexOf( "\\", starta );
				        inputBreeda = animals.substring( starta, enda );
					while( !currentItema.getContents().equals(inputBreeda) ){
					    currentItema = currentItema.getNext();
					}
					player.eatAnimal( currentItema.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
				else if ( input.equals("4") ) {
				    if ( animals.contains( input ) ) {
					starta = animals.indexOf( input, 0 ) + 3;
					enda = animals.indexOf( "\\", starta );
					inputBreeda = animals.substring( starta, enda );
					while( !currentItema.getContents().equals(inputBreeda) ){
					    currentItema = currentItema.getNext();
					}
					player.eatAnimal( currentItema.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
				else if ( input.equals("5") ) {
				    if ( animals.contains( input ) ) {
					starta = animals.indexOf( input, 0 ) + 3;
					enda = animals.indexOf( "\\", starta );
				        inputBreeda = animals.substring( starta, enda );
					while( !currentItema.getContents().equals(inputBreeda )){
					    currentItema = currentItema.getNext();
					}
					player.eatAnimal( currentItema.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
				else if ( input.equals("6") ) {
				    if ( animals.contains( input ) ) {
					starta = animals.indexOf( input, 0 ) + 3;
					enda = animals.indexOf( "\\", starta );
					inputBreeda = animals.substring( starta, enda );
					while( !currentItema.getContents().equals(inputBreeda) ){
					    currentItema = currentItema.getNext();
					}
					player.eatAnimal( currentItema.getItem().peek() );
					break;
				    }
				    else {
					System.out.println( "Invalid Input! Try Again!");
				    }
				}
			    }
			}
		    }
		    else if ( input.equals("3") ) {
			break;
		    }
		}

	    }
	    else if ( code == 6 ) {
		player.getItems().display();
	    }

	}

    } // end of main method

} // end of class Woo
