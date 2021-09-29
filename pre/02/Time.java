public class Time{
      public static void main(String[] args){
            double hour = 22.0;
            double minute = 48.0;
            double second = 30.0;
            System.out.println(hour * 60 * 60 + minute * 60 + second);
            System.out.println((24 * 60  * 60) - (hour * 60 * 60 + minute * 60 + second));
            System.out.println((hour * 60 * 60 + minute * 60 + second) / (24 * 60  * 60) * 100.0);
            double hour1 = 22.0;
            double minute1 = 54.0;
            double second1 = 47.0;
            System.out.println((hour1 * 60 * 60 + minute1 * 60 + second1) - (hour * 60 * 60 + minute * 60 + second) + " seconds");

      }
}
