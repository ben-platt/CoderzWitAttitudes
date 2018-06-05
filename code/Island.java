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


    // CONSTRUCTOR(S)
    public Island(){
      addAnimals();
      addPlants();
      addFish();
    }

    // METHODS
    public ArrayList<Animal> getAnimals(){
      return animals;
    }

    public ArrayList<Plant> getPlants(){
      return plants;
    }

    public LinkedList<Fish> getFish(){
      return fishpond;
    }

    public int getNumAnimals(){
      return animals.size();
    }

    public int getNumPlants(){
      return plants.size();
    }

    public int getNumFish(){
      return fishpond.size();
    }

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
    //random generatioon of plants, follow addAnimals method
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
