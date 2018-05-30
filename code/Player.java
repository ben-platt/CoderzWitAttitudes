// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Player
 *****************************************************/

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
    public Player{
	age = 17;
	height = 65.0;
	weight = 108.0;
	life = 42.0;
    }
    //PUt another construcotr based on user input later
    
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
	return plants.peek();
    }
    public Animal getAnimal(){
	return animals.peek();
    }

    //Eating methods
    public double eatPlant(){
	Plant current = plants.pop();
	

} // end of class
