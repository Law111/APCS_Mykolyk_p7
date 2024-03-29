/***
  Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
  APCS pd7
  HW75 -- Nodal Recall
  2022-03-14m
  time spent: 0.5 hr
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 **/

public interface List
{
  //add node to list, containing input String as its data
  public boolean add( String x );

  //return data in element at position i
  public String get( int i );

  //overwrite data in element at position i
  public String set( int i, String x );

  //return length of list
  public int size();

}//end interface
