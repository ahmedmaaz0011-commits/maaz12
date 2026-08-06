public class Rational {
    private int num; // upar wala
    private int den; // neeche wala

    // 1. Default constructor: 0/1
    public Rational() {
       this.num = 0;
       this.den = 1;
    }

    // 2. Parameterized constructor: n/d
    public Rational(int n, int d) {
      this.num = n; 
        this.den = d;
    }

    // 3. Add: a/b + c/d = (ad + bc) / bd
    public Rational add(Rational r) {
        int newNum = this.num * r.den + r.num * this.den;
        int newDen = this.den * r.den;
        return new Rational(newNum, newDen);
    }

    // 4. Subtract: a/b - c/d = (ad - bc) / bd
    public Rational subtract(Rational r) {
        int newNum = this.num * r.den - r.num * this.den;
        int newDen = this.den * r.den;
        return new Rational(newNum, newDen);
    }

    // 5. Multiply: a/b * c/d = ac / bd
    public Rational multiply(Rational r) {
        return new Rational(this.num * r.num, this.den * r.den);
    }

    // 6. Divide: a/b / c/d = ad / bc
    public Rational divide(Rational r) {
        return new Rational(this.num * r.den, this.den * r.num);
    }

    // 7. Print karne ke liye
    public String toString() {
        return num + "/" + den;
    }
}  
public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2); // 1/2
        Rational r2 = new Rational(3, 4); // 3/4

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println();

        System.out.println("Add: " + r1.add(r2));       // 10/8
        System.out.println("Sub: " + r1.subtract(r2));  // -2/8
        System.out.println("Mul: " + r1.multiply(r2));  // 3/8
        System.out.println("Div: " + r1.divide(r2));    // 4/6
    }
}
  


  
}
