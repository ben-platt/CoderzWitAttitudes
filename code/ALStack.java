//Fiona Cai
//APCS2 pd 1
//HW32 -- Leon Leonwood Stack ... founder of L.L. Bean
//2018-04-12

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{

  private ArrayList<PANCAKE> astack;

  public ALStack(){
    astack = new ArrayList<PANCAKE>();
  }

  public ALStack(int size){
    astack = new ArrayList<PANCAKE>(size);
  }

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty(){
    return astack.size() == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peek(){
    if(!astack.isEmpty()){ //if the stack ain't empty
      return astack.get(astack.size()-1);
    }
    else{ //if stack is empty
      return null;
    }
  }

  //Pop and return top element of stack.
  public PANCAKE pop(){
    if(!astack.isEmpty()){
      PANCAKE popped = astack.remove(astack.size()-1);
      return popped;
    }
    else{
      return null;
    }
  }

  //Push an element onto top of this stack.
  public void	push( PANCAKE x ){
    astack.add(x);
  }

}
