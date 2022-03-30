/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Z> cakes = new ALStack<Z>();
    cakes.push(5);
    cakes.push(9);
    cakes.push(2);
    cakes.push(4);
    cakes.push("awrojawr");
    cakes.push('/');
    cakes.pop();
    System.out.println(cakes.isEmpty());
    System.out.println(cakes);
    System.out.println(cakes.peekTop());
    //Stack<Z> cakes = new LLStack<Z>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...

  }//end main

}//end class
