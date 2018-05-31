// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Player
 *****************************************************/

import java.util.Stack;
import java.util.ArrayList;

public class Player {

    // INSTANCE VARIABLES
    int age;
    double height;
    double weight;
    double life;
    double maxNutri;
    ArrayList<Stack<Plant>> plants;
    ArrayList<Stack<Animal>> animals;

    // CONSTRUCTOR(S)
    //Default constructor
    public Player() {
	age = 17;
	height = 65.0;
	weight = 108.0;
	life = 42.0;
    }
    
    //PUt another construcotr based on user input later
    // Maybe we can just use these mutator methods for user input
    
    // METHODS
    
    //Accessor methods
    public int getAge(){
	return age;
    }
    public double getHeight(){
	return height;
    }
    public double getWeight(){
	return weight;
    }
    public double getLife(){
	return life;
    }
    public Plant getPlant(){
	return plants.peek(); // !THIS STACK METHOD DOESN'T WORK!
    }
    public Animal getAnimal(){
	return animals.peek(); // !THIS STACK METHOD DOESN'T WORK!
    }

    // Mutator Methods
    public int setAge( int inputAge ){
        age = inputAge;
    }
    public double setHeight( double inputHeight ){
	height = (double) inputHeight;
    }
    public double setWeight( double inputWeight ){
	weight = (double) inputWeight;
    }
    private double setLife( double inputLife ){
	life = inputLife;
    }    

    //Eating methods
    public double eatPlant(){
	Plant current = plants.pop(); // !THIS STACK METHOD DOESN'T WORK!
    }

} // end of class
