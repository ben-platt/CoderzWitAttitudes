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
       1. Tools
       2. Collected Items
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
	while( currentItem.getNext() != null ) {
	    if ( currentItem.getContents() == thing.name ) {
		currentItem.getItem().push( thing );
		incrementQuantity();
	    }
	}
    }

    public void remove( Object thing ) {

    }

}//end ItemQueue   
