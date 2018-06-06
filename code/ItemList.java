// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class ItemList
 ******************************************************/

import java.util.Stack;

public class ItemList {

    // INSTANCE VARIABLES
    public ItemNode _start, _end;
    public int _size;

    // CONSTRUCTOR(S)
    public ItemList() {
	_start = _end = null;
	_size = 0;
    }

    // METHODS

    /* Items are sorted as such :
       1. Stacks of Tools
       2. Stacks of Collected Plants
       3. Stacks of Edible Plants
       4. Stacks of Animals
    */

    public void add( Item thing ) {
	if ( _size == 0 ) {
	    _start.setItem( thing );
	    _size = 1;
	    return;
	}
	ItemNode currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getContents() == thing.name ) {
		currentItem.getItem().push( thing );
		currentItem.incrementQuantity();
		return;
	    }
	    currentItem = currentItem.getNext();
	}
	currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getType() == thing.type ) {
	        ItemNode newNext = currentItem.getNext();
		ItemNode newItem = new ItemNode( thing );
		currentItem.setNext( newItem );
		newItem.setPrev( currentItem );
		newItem.setNext( newNext );
		newNext.setPrev( newItem );
		_size++;
		return;
	    }
	    currentItem = currentItem.getNext();
	}
	ItemNode newPrev = currentItem.getPrev();
	currentItem = new ItemNode( thing );
	currentItem.setPrev( newPrev );
	_size++;
    }

    public void remove( Item thing ) {
	ItemNode currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getContents() == thing.name ) {
		currentItem.getItem().pop();
		currentItem.decrementQuantity();
		return;
	    }
	    currentItem = currentItem.getNext();
	}
    }

}//end ItemQueue   
