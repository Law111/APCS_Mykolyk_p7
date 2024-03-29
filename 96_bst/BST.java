/**
  Team Cookie (Justin Mohabir, Lawrence Joa, Lior)
  APCS pd7
  HW95 -- Algorithm as Data Structure
  2022-05-09m
  time spent: 1 hrs

 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  public TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    /*** YOUR IMPLEMENTATION HERE ***/
    if(_root==null){
      _root=newNode;
    } else {
      insert(_root,newNode);
    }
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if (newNode.getValue()>stRoot.getValue()){
      if (stRoot.getRight()==null){
        stRoot.setRight(newNode);
      } else {
        insert(stRoot.getRight(),newNode);
      }
    } else if (newNode.getValue()<stRoot.getValue()){
      if (stRoot.getLeft()==null){
        stRoot.setLeft(newNode);
      } else {
        insert(stRoot.getLeft(),newNode);
      }
    }
    /*** YOUR IMPLEMENTATION HERE ***/
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }

  public void preOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode==null){return;}
    System.out.print(currNode.getValue());
    preOrderTrav(currNode.getLeft());
    preOrderTrav(currNode.getRight());
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode==null){return;}
    preOrderTrav(currNode.getLeft());
    System.out.print(currNode.getValue());
    preOrderTrav(currNode.getRight());
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if(currNode==null){return;}
    preOrderTrav(currNode.getLeft());
    preOrderTrav(currNode.getRight());
    System.out.print(currNode.getValue());
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


      /*****************************************************
       * TreeNode search(int)
       * returns pointer to node containing target,
       * or null if target not found
       *****************************************************/
      public TreeNode search( int target )
      {
      	/*** YOUR IMPLEMENTATION HERE ***/
        return searchHelp( _root, target);
      }

      public TreeNode searchHelp(TreeNode currNode, int target){
        if (currNode == null){
          return null;
        }
        if(currNode.getValue() < target){
          return searchHelp(currNode.getRight(), target);
        }
        else if(currNode.getValue() > target){
          return searchHelp(currNode.getLeft(), target);
        }
        else {
          return currNode;
        }
      }



      /*****************************************************
       * int height()
       * returns height of this tree (length of longest leaf-to-root path)
       * eg: a 1-node tree has height 1
       *****************************************************/
      public int height()
      {
      	/*** YOUR IMPLEMENTATION HERE ***/
        return heightHelp(_root);
      }

      public int heightHelp(TreeNode currNode){
        if(currNode == null){
          return 0;
        } else {
          return Math.max(heightHelp(currNode.getLeft()), heightHelp(currNode.getRight()))+1;
        }
      }


      /*****************************************************
       * int numLeaves()
       * returns number of leaves in tree
       *****************************************************/
      public int numLeaves()
      {
      	/*** YOUR IMPLEMENTATION HERE ***/
        return numLeavesHelp(_root);
      }

      public int numLeavesHelp(TreeNode currNode){
        if(currNode == null){
          return 0;
        }
        if(currNode.getLeft()==null && currNode.getRight()==null){
          return 1;
        } else {
          return numLeavesHelp(currNode.getLeft()) + numLeavesHelp(currNode.getRight());
        }
      }


  //main method for testing
  public static void main( String[] args )
  {


      BST arbol = new BST();

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );


      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();
      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

      System.out.println( "\n-----------------------------");

      System.out.println("Testing search");
      for(int i=1; i<=6; i++){
        System.out.println(arbol.search(i).getValue());
      }
      System.out.println(arbol.search(420));
      System.out.println( "\n-----------------------------");
      System.out.println("Testing height");
      System.out.println(arbol.height());
      System.out.println( "\n-----------------------------");
      System.out.println("Testing numLeaves");
      System.out.println(arbol.numLeaves());
      System.out.println( "\n-----------------------------");
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
