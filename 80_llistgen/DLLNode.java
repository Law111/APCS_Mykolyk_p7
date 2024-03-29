// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW80 -- Generically Speaking
// 2022-03-25f
// time spent: 0.5 hr

/***
 * class DLLNode<T> v1
 * Implements a node, for use in lists and other container classes.
 * Stores a String as cargo.
 **/

public class DLLNode<T>
{
  private T _cargo;    //cargo may only be of type String
  private DLLNode<T> _nextNode, _prevNode; //pointers to next, prev DLLNode<T>s


  // constructor -- initializes instance vars
  public DLLNode ( T value, DLLNode<T> prev, DLLNode<T> next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo() { return _cargo; }

  public DLLNode<T> getNext() { return _nextNode; }

  public DLLNode<T> getPrev() { return _prevNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo( T newCargo )
  {
    T foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<T> setNext( DLLNode<T> newNext )
  {
    DLLNode<T> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<T> setPrev( DLLNode<T> newPrev )
  {
    DLLNode<T> foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...

 /*********************
    //Create a node
    DLLNode<T> first = new DLLNode<T>( "cat", null );
    //Create a new node after the first
    first.setNext( new DLLNode<T>( "dog", null ) );
    //Create a third node after the second
    first.getNext().setNext( new DLLNode<T>( "cow", null ) );
    DLLNode<T> temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
   ***********************/
  }//end main

}//end class DLLNode<T>
