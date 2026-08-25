public class Rational {
    private int num; 
    private int den; 

    public Rational() {
       this.num = 0;
       this.den = 1;
    }

    public Rational(int n, int d) {
      this.num = n; 
        this.den = d;
    }

    public Rational add(Rational r) {
        int newNum = this.num * r.den + r.num * this.den;
        int newDen = this.den * r.den;
        return new Rational(newNum, newDen);
    }

    
    public Rational subtract(Rational r) {
        int newNum = this.num * r.den - r.num * this.den;
        int newDen = this.den * r.den;
        return new Rational(newNum, newDen);
    }

    /
    public Rational multiply(Rational r) {
        return new Rational(this.num * r.num, this.den * r.den);
    }

    public Rational divide(Rational r) {
        return new Rational(this.num * r.den, this.den * r.num);
    }

    public String toString() {
        return num + "/" + den;
    }
}  
public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2); // 1/2
        Rational r2 = new Rational(3, 4); /

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println();

        System.out.println("Add: " + r1.add(r2));       
        System.out.println("Sub: " + r1.subtract(r2));  
        System.out.println("Mul: " + r1.multiply(r2));  
        System.out.println("Div: " + r1.divide(r2));    
    }
}
}
