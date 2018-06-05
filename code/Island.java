// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
* class Island
*****************************************************/
import java.util.ArrayList;
import java.util.LinkedList;

public class Island{

  // INSTANCE VARIABLES
  private ArrayList<Animal> animals;
  private LinkedList<ArrayList<Fish>> fishpond;
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

  public LinkedList<ArrayList<Fish>> getFish(){
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

  public int getDepth(){
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
    int num = (int) (Math.random() * 10 ); //levels of depth of the pond
    for(int i = 0; i < num; i++ ){
      ArrayList<Fish> currentdepth = new ArrayList<Fish>();
      for(int j = 0; j < (int) (Math.random() * 10); j++){
        int index = (int)( Math.random() * 3);
        if(index == 0){
          currentdepth.add(new Fugu());
        }
        else if (index == 1){
          currentdepth.add(new Tuna());
        }
        else{
          currentdepth.add(new Catfish());
        }
      }
      fishpond.add(currentdepth);
    }
  }

  public void removeAnimal(int i){
    animals.remove(i);
  }

  public void removePlant(int i){
    plants.remove(i);
  }

  public void removeFish(int i){
    fishpond.remove(i);
  }

} // end of class
