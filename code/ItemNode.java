// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class ItemNode
 ******************************************************/

public class ItemNode<Object> {

    // INSTANCE VARIABLES
    private Object _item;
    private ItemNode<Object> _prevItem;
    private ItemNode<Object> _nextItem;

    // CONSTRUCTOR(S)
    public ItemNode( Object value, ItemNode<Object> prev, ItemNode<Object> next ) {
	_item = value;
	_prevItem = prev;
	_nextItem = next;
    }

    // METHODS

    // * Accessors *
    public Object getItem() {
	return _item;
    }
    public ItemNode<Object> getPrev() {
	return _prevItem;
    }
    public ItemNode<Object> getNext() {
	return _nextItem;
    }

    // * Mutators *
    public void setItem( Object newValue ) {
	_item = newValue;
    }
    public void setNext( ItemNode<Object> newNext ) {
	_nextItem = newNext;
    }
    public void setPrev( ItemNode<Object> newPrev ) {
	_prevItem = newPrev;
    }
    
    // override inherited toString
    public String toString() {
	return _item.toString();
    }
    

}//end ItemNode
