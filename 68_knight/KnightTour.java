// Watermelon: Lea Kwok, Nina Jiang, Lawrence Joa
// APCS pd7
// HW68 -- recursively probing for a closed cycle
// 2022-03-02
// time spent: 1.5 hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 *   Random moves are generated. If there is no solution, the program backtracks.
 * DISCO
 *
 * QCC
 *
 * Mean execution times(real time) for boards of size n*n:
 * n=5   1.579s    across 5 executions
 * n=6   20.198s    across 3 executions
 * n=7   11min 16.567s    across 1 execution
 * n=8   15min 7.039s    across 1 execution
 *
 * Note: All executions were done from top left corner
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 5;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 6, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    // int startX = (int)(n * Math.random());
    // int startY = (int)(n * Math.random());
    // tf.findTour( startX+2, startY+2, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour

class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[_sideLength + 4][_sideLength + 4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    //???
    for(int i = 0; i < _sideLength + 4; i++) {
      for(int j = 0; j < _sideLength + 4; j++) {
        _board[i][j] = -1;
      }
    }

    for(int i = 2; i < _sideLength + 2; i++) {
      for(int j = 2; j < _sideLength + 2; j++) {
        _board[i][j] = 0;
      }
    }

     //-----------
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( this._solved ) System.exit(0);

    //primary base case: tour completed
    if ( moves > (_board.length-4)*(_board.length-4)  ) {
      //???
      System.out.println( this ); //refresh screen
      _solved = true;
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0 ) {
      moves--;
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;
      moves++;

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      //???

      findTour(x + 1, y + 2, moves); // a
      findTour(x + 2, y + 1, moves); // b
      findTour(x + 2, y - 1, moves); // c
      findTour(x + 1, y - 2, moves); // d
      findTour(x - 1, y - 2, moves); // e
      findTour(x - 2, y - 1, moves); // f
      findTour(x - 2, y + 1, moves); // g
      findTour(x - 1, y + 2, moves); // h


      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
        //???

        _board[x][y] = 0;

      System.out.println( this ); //refresh screen
    }
  }//end findTour()

}//end class TourFinder
