/*
  Yat Long Chan, Lawrence Joa, Joshua Gao.
  APCS pd7
  HW42 -- Be More Rational -- Creating more methods for rational numbers
  2021-12-02
  Time spent: 0.5 hours (class time)
  DISCOs
  nothing new
  QCCs
  none
*/

public class Rational implements Comparable{
  private int numerator;
  private int denominator;

  public String toString(){
    return numerator + "/" + denominator;
  }

  public Rational(){
    numerator=0;
    denominator=1;
  }

  public Rational(int x, int y){
    this();
    if (y == 0){
      System.out.println("ERROR: denominator cannot be 0");
    } else {
      numerator = x;
      denominator = y;
    }
  }

  public double floatValue(){
    return (double)numerator/denominator;
  }

  public void multiply(Rational n){
    this.numerator *= n.numerator;
    this.denominator *= n.denominator;
  }

  public void divide(Rational n){
    if (n.numerator == 0){
      System.out.println("ERROR: Dividing by 0");
    } else {
      this.numerator *= n.denominator;
      this.denominator *= n.numerator;
    }
  }

  public int gcd(){
    int n = this.numerator;
    int d = this.denominator;
    while (n != d){
      if (n > d){
        n -= d;
      } else {
        d -= n;
      }
    }
    return n;
  }

  public void add(Rational r){
     this.numerator = (this.numerator * r.denominator) + (r.numerator * this.denominator);
     this.denominator = this.denominator * r.denominator;
  }

  public void subtract(Rational r){
     this.numerator = (this.numerator * r.denominator) - (r.numerator * this.denominator);
     this.denominator = this.denominator * r.denominator;
  }

  public void reduce(){
    int tempGCD = gcd();
     this.numerator = this.numerator / tempGCD;
     this.denominator = this.denominator / tempGCD;
  }

  public int compareTo(Object o){
    if(o instanceof Rational){
      Rational r = (Rational)o;
      int greater = 0;

       if (this.numerator * r.denominator > this.denominator * r.numerator){
        return 1;
      } else if (this.numerator * r.denominator < this.denominator * r.numerator){
        return -1;
      }
      return greater;
    }
    return 0;
  }
}
