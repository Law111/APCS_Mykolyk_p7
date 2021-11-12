import java.util.*;

public class Loopier{

  public static void randArr(int[] x){
    for(int i=0; i<x.length; i++){
      x[i] = (int)(Math.random() * 100);
    }
  }
  public static void main(String[] args){
    int[] x = new int[15];
    Loopier hi = new Loopier();
    hi.randArr(x);
  }
}
