public class Loops{

    public static double power(double x, double n){
        double originalNumber = x;
        for (double i = n; i > 1; i--) {
            x = x*originalNumber;
        }
        return x;
    }

    public static double factorial(double x){
        for(double i = x-1; i>0; i--){
            x = x * i;
        }
        return x;
    }

    public static double myexp(double x, double n){
        double sum = 1;
        for(double i=n; i>0; i--){
            sum = sum + power(x,i) / factorial(i);
        }
        return sum;
    }

    public static void check(double x){
        System.out.println(x);
        System.out.println(myexp(x,100));
        System.out.println(Math.exp(x));
   }

    public static void main(String[] args){
        System.out.println(power(3,4));
        System.out.println(factorial(5));
        System.out.println(myexp(2,5));
        for(double i=0.1; i<1000; i=i*10){
            check(i);
        }
        for(double i=-0.1; i>-1000; i=i*10){
            check(i);
        }
    }
}
