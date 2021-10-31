public class string2{

  //Given a string, return a string where for every char in the original,
  //there are two chars.
  public static String doubleChar(String str) {
    String thing = "";
    for(int i=0; i<str.length(); i++){
      thing = thing + str.charAt(i) + str.charAt(i);
    }
    return thing;
  }

  //Return the number of times that the string "hi" appears
  //anywhere in the given string.
  public static int countHi(String str){
    String a = "";
    int count = 0;
    for(int i=0; i<str.length()-1; i++){
      a = str.substring(i, i+2);
      if(a.equals("hi")){
        count++;
      }
    }
    return count;
  }

  //Return true if the string "cat" and "dog" appear the same number of times
  //in the given string.
  public static boolean catDog(String str){
    String a = "";
    int countcat = 0;
    int countdog = 0;
    boolean equal = true;
    for(int i=0; i<str.length()-2; i++){
      a = str.substring(i, i+3);
      if(a.equals("cat")){
        countcat++;
      } else if(a.equals("dog")){
        countdog++;
      }
    }
    if(countcat != countdog){
      equal = false;
    }
    return equal;
  }

  //Return the number of times that the string "code" appears anywhere in the
  //given string, except we'll accept any letter for the 'd', so
  //"cope" and "cooe" count.
  public static int countCode(String str){
    String a = "";
    int count = 0;
    for(int i=0; i<str.length()-3; i++){
      a = str.substring(i, i+2);
      if(a.equals("co")){
        a = str.substring(i+3,i+4);
        if(a.equals("e")){
          count++;
        }
      }
    }
    return count;
  }

  //Given two strings, return true if either of the strings appears at the very
  //end of the other string, ignoring upper/lower case differences
  //(in other words, the computation should not be "case sensitive").
  //Note: str.toLowerCase() returns the lowercase version of a string.
  public static boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    boolean end = false;
    if(a.indexOf(b) != -1){
      if(a.indexOf(b) == a.length() - b.length()){
        end = true;
      }
    }
    if(b.indexOf(a) != -1){
      if(b.indexOf(a) == b.length() - a.length() ){
        end = true;
      }
    }
    return end;
  }

  //Return true if the given string contains an appearance of "xyz"
  //where the xyz is not directly preceeded by a period (.). So "xxyz"
  //counts but "x.xyz" does not.
  public static boolean xyzThere(String str) {
    boolean there = false;
    String a = "";
    for(int i=0; i<str.length()-2; i++){
      a = str.substring(i,i+3);
      if(a.equals("xyz")){
        if(i==0){
          there = true;
        }
        if(i>0){
          a = str.substring(i-1, i);
          if(a.equals(".")){
            there = false;
          } else {
            there = true;
            break; //this break; is required, it shouldn't have worked without it
          }
        }
      }
    }
    return there;
  }

  public static void main(String[] args){
    System.out.println("doubleChar tests:");
    System.out.println("The: " + doubleChar("The"));
    System.out.println("AAbb: " + doubleChar("AAbb"));
    System.out.println();
    System.out.println("countHi tests:");
    System.out.println("abc hi ho: " + countHi("abc hi ho"));
    System.out.println("ABChi hi: " + countHi("ABChi hi"));
    System.out.println();
    System.out.println("catDog tests:");
    System.out.println("catdog: " + catDog("catdog"));
    System.out.println("catxdogxdogxca: " + catDog("catxdogxdogxca"));
    System.out.println();
    System.out.println("countCode tests:");
    System.out.println("aaacodebbb: " + countCode("aaacodebbb"));
    System.out.println("AAcodeBBcoleCCccoreDD: " + countCode("AAcodeBBcoleCCccoreDD"));
    System.out.println();
    System.out.println("endOther tests:");
    System.out.println("AbC, HiaBc: " + endOther("AbC", "HiaBc"));
    System.out.println("yz, 12xz: " + endOther("yz", "12xz"));
    System.out.println();
    System.out.println("xyzThere tests:");
    System.out.println("abc.xyzxyz: " + xyzThere("abc.xyzxyz"));
    System.out.println("1.xyz.xyz2.xyz: " + xyzThere("1.xyz.xyz2.xyz"));
  }
}
