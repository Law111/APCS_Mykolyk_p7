public class Driver {

  public static void main( String[] args ) {
  	Coin yours = new Coin("quarter");
  	Coin wayne = new Coin("dollar", "heads");
  	int x = 5;
  	int y = 5;
	  while (yours.headsCtr + wayne.headsCtr < x){
		    yours.flip();
		    wayne.flip();
	  }
    System.out.println(yours.headsCtr); // check # of times yours was heads
    System.out.println(wayne.headsCtr); // check # of times wayne was heads

	  yours.reset("heads", 0.5);
	  wayne.reset("heads", 0.5);

    int match = 0;
	  while (match < y){
		    yours.flip();
		    wayne.flip();
        if ( yours.equals(wayne) ) {
          match++; // check if match = y
        }
    }
    System.out.println(match);

	  yours.reset("heads", 0.5);
	  wayne.reset("heads", 0.5);
		int match2 = 0;
	  while (match2 <= 65536 || match2%2005 != 0) {
		    yours.flip();
		    wayne.flip();
        if ( yours.equals(wayne) ) {
          match2++;
		    }
    }
    System.out.println(match2); // check if match2 suits >65536 and %2005==0
  }//end main()

}//end class
