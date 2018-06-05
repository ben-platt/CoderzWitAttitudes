// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Island
 *****************************************************/
import java.util.ArrayList;

public class Island {

    // INSTANCE VARIABLES
    private ArrayList<Animal> animals;
    private LinkedList<Fish> fishpond;
    private ArrayList<Plant> plants;
    private Player p;

    // CONSTRUCTOR(S)
    public Island(){
      p = new Player();
    }

    public Island(int a, double h, double w, double heal){
      p = new Player(int a, double h, double w, double heal);
    }

    // METHODS
    public void addAnimals(){
      int num = (int) (Math.random() * 20 );
      for(int i = 0; i < num; i++){
        if(i%5 == 0 && i%3 != 0){
          animals.add(new WildBoar());
        }
        else if (i%3 == 0){
          animals.add(new Turkey());
        }
        else{
          animals.add(new Frog()); //Frogs are most common
        }
      }
    }

    public void addPlants(){
      int num = (int) (Math.random() * 30 );
      for(int i = 0; i < num; i++){
        if(i%5 == 0 && i%3 != 0){
          animals.add(new WildBoar());
        }
        else if (i%3 == 0){
          animals.add(new Turkey());
        }
        else{
          animals.add(new Frog()); //Frogs are most common
        }
      }
    }

    public void addFish(){
      int num = (int) (Math.random() * 20 );
      for(int i = 0; i < num; i++ ){
        int index = (int)( Math.random() * 2);
        if(index == 0){
            fishpond.add(new Fugu());
        }
        else if (index == 1){
            fishpond.add(new Tuna());
        }
        else{
            fishpond.add(new Catfish());
        }
      }
    }

} // end of class
