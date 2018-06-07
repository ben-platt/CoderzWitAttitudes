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
  private ArrayList<Plant> plants;
  private LinkedList<ArrayList<Fish>> fishpond;



  // CONSTRUCTOR(S)
  public Island(){
    animals = new ArrayList<Animal>();
    plants = new ArrayList<Plant>();
    fishpond = new LinkedList<ArrayList<Fish>>();
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
      if(i%5 == 0){
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
    int num = (int) (Math.random() * 50 );
    for(int i = 0; i < num/7; i++){
      plants.add(new Fern());
    }
    for(int i = num/7; i < 2*num/7; i++){
      plants.add(new GuavaTree());
    }
    for(int i = 2*num/7; i < 3*num/7; i++){
      plants.add(new Mushroom());
    }
    for(int i = 3*num/7; i < 4*num/7; i++){
      plants.add(new PalmTree());
    }
    for(int i = 4*num/7; i < 5*num/7; i++){
      plants.add(new Petunia());
    }
    for(int i = 5*num/7; i < 6*num/7; i++){
      plants.add(new ThimbleBush());
    }
    for(int i = 6*num/7; i<num; i++){
      plants.add(new Tree());
    }
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
