// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class ItemList
 * a priority queue that stores the player's items
 ******************************************************/
import java.util.ArrayList;

public class ItemList<Object> {

   // ~~ INSTANCE VARIABLES ~~
    
    private ArrayList<Object> _queue;
    private int _size;

    // ~~~~ CONSTRUCTOR(S) ~~~~

    public ItemQueue( int size )
    {
        _queue = new ArrayList( size );
	_size = 0;
    }
    
    // ~~~~~~~ METHODS ~~~~~~~~
    
    // means of removing an element from collection:
    // Dequeues and returns the first element of the queue.
    public Object remove() {
	Object removed = _queue.get( _queue.size() - 1 );
        _queue.remove( _queue.size() - 1 );
	return removed;
    }

    // means of adding an element to collection:
    // Enqueue an element onto the back of this queue.
    public void add( Object x ) {
	ArrayList temp = new ArrayList();
	temp.add( x );
	for( int i = 0; i < _queue.size(); i++ ) {
	    temp.add( _queue.get(i) );
	}
	_queue = temp;
    }

    // Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty() {
	return _queue.isEmpty();
    }

    // Returns the first element of the queue without dequeuing it.
    public Object peekFront() {
	return _queue.get( _queue.size() - 1 );
    }

    // MAIN METHOD
    public static void main( String[] args ) {

        ItemQueue<String> line = new ItemQueue(3);
	line.enqueue( "zoo" );
	line.enqueue( "wee" );
	line.enqueue( "mama" );
	System.out.println( line.dequeue() ); // zoo
	System.out.println( line.isEmpty() ); // false
	System.out.println( line.peekFront() ); // wee
	line.dequeue(); 
	System.out.println( line.dequeue() ); // mama
	System.out.println( line.isEmpty() ); // true
	
    } // end of main method

}//end ItemQueue   
