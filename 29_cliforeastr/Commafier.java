public class Commafier{
  public static String commafyF(int n){
   int ctr=0;
   String ans="";
   String xyz=Integer.toString(n);
    for(int i=xyz.length()-1;i>=0;i--){
      ans=xyz.substring(i,i+1)+ans;
      ctr++;

      if (xyz.length()!=3 && ctr%3==0){
        ans=","+ans;
      }
    }
    return ans;
  }

  public static String commafyR(int n){
    String ans = "";
    String xyz=Integer.toString(n);
    if(xyz.length() > 3){
      ans = "," + xyz.substring(xyz.length()-3,xyz.length()) + ans;
      return commafyR(n / 1000) + ans;
    }
    if(xyz.length() <= 3){
      ans = xyz + ans;
    }
    return ans;

  }


  public static void main(String [] args){
    /*System.out.println(commafyF(1000));
    System.out.println(commafyF(12872178));
    System.out.println(commafyF(100));
    System.out.println(commafyR(1000));
    System.out.println(commafyR(12872178));
    System.out.println(commafyR(100));*/
  }

}
