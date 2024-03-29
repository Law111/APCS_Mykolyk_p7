/***
Watermelon (Nina Jiang, Lawrence Joa)
APCS pd7
HW61: Instructions so Simple...
2022-02-08
time spent: 0.6 hr

  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  Take 2 sorted int arrays
  Initialize an int array with length of sum of the 2 arrays (finalArr)
  Compare first elements of both arrays
  If element of 1st array <= 2nd array element, add 1st array element to finalArr and move index+1
  If element of 2nd array is < 1st array element, add 2nd array element to finalArr and move index+1
  If either array reaches the end, add the rest of the other array to finalArr

  ***/

import java.util.Arrays;

public class MergeSort
{
  private int arr;
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] finalArr = new int[a.length+b.length];
    int bLen = 0;
    int aLen = 0;
    while(aLen<a.length && bLen<b.length){
      if(a[aLen]<=b[bLen]){
        finalArr[aLen+bLen]=a[aLen];
        aLen++;
      } else {
        finalArr[aLen+bLen]=b[bLen];
        bLen++;
      }
      if(aLen==a.length){
        while(bLen<b.length){
          finalArr[aLen+bLen]=b[bLen];
          bLen++;
        }
      }
      if(bLen==b.length){
        while(aLen<a.length){
          finalArr[aLen+bLen]=a[aLen];
          aLen++;
        }
      }
    }
    return finalArr;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    if(arr.length <= 1) {
      return arr;
    }

    int mid = arr.length / 2;
    int[] arrLeft = new int[mid];
    int[] arrRight = new int[arr.length - mid];
    for(int i = 0; i < mid; i++) {
      arrLeft[i] = arr[i];
    }
    for(int j = 0; j < arrRight.length; j++) {
      arrRight[j] = arr[arr.length-mid+j-1];
    }
    return merge(arrLeft, arrRight);
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for(int i=0; i<a.length-1; i++){
      System.out.print( i + ",");
    }
    System.out.println(a[a.length-1] + "]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
