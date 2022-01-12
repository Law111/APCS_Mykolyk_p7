/*
Fred Gang: Joseph Othman, Michael Kamela, Lawrence Joa
APCS pd7
HW54 -- Sorting Algos
2022-01-12
time spent: 0.1 hrs
*/
import java.util.ArrayList;

public class MySorts{

  public static void bubbleSort( ArrayList<Comparable> data ) //Exit-Early instead of Vanilla
  {
    for (int i = 0; i < data.size() - 1; i ++) {
        for (int j = data.size() - 1; j > i; j --) {
            Comparable leftVal = data.get(j - 1);
            Comparable rightVal = data.get(j);
            if (leftVal.compareTo(rightVal) > 0) {
                data.set(j, leftVal);
                data.set(j - 1, rightVal);
            }
        }
    }
  } //end bubbleSort

  public static void selectionSort( ArrayList<Comparable> data ){
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size() - 1; pass > -1; pass-- ) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = pass;

      for(int i = 0; i < pass; i++  ) {
        Comparable p1 = data.get(maxPos);
        Comparable p2 = data.get(i);
        if(p1.compareTo(p2) < 0) {
          maxPos = i;
        }
      }

      Comparable p3 = data.get(maxPos);
      Comparable p4 = data.get(pass);
      System.out.println( "maxPos: " + maxPos );//diag
      System.out.println( data );//diag
      data.set(pass, p3);
      data.set(maxPos, p4);


      System.out.println( "after swap: " +  data );//diag
      }
  } //end selectionSort

  public static void insertionSortV( ArrayList<Comparable> data ){
    for(int partition=1; partition<data.size(); partition++  ) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i=partition; i>0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        Comparable p1 = data.get(i);
        Comparable p2 = data.get(i-1);
        if (p2.compareTo(p1)>0  ) {


          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          data.set(i,p2);
          data.set(i-1,p1);
        }
        else
          break;
      }
    }
  }

}
