public class Driver{
  public static void main(String[] args){
    Rational r = new Rational(4,5);
    Rational s = new Rational(1,3);
    Rational t = new Rational(10, 25);
    System.out.println("=====TEST toString()=====");
    System.out.println(r.toString());
    System.out.println(s.toString());
    System.out.println(t.toString());
    r.add(s);
    System.out.println(r.toString());
    t.reduce();
    System.out.println(t.toString());
    System.out.println(r.compareTo(t));
    /*
    System.out.println("=====TEST FLOATING POINT CONVERSION=====");
    System.out.println(r.floatVal());
    System.out.println(s.floatVal());
    System.out.println("=====TEST multiply()=====");
    r.multiply(s);
    System.out.println(r.toString());
    System.out.println("=====TEST divide()=====");
    r.divide(s);
    System.out.println(r.toString());
    r.divide(t);
    System.out.println(r.toString());
    System.out.println(t.gcd()); */
  }
}
