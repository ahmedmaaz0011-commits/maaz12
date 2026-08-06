public class Complex {
    // 1. Private attributes - Encapsulation
    private double real;   // real part
    private double imag;   // imaginary part

    // 2. Default Constructor
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    // 3. Parameterized Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // 4. Copy Constructor
    public Complex(Complex c) {
        this.real = c.real;
        this.imag = c.imag;
    }

    // 5. Getters
    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    // 6. Setters
    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // 7. Add
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // 8. Subtract
    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // 9. Multiply: (a+bi)(c+di) = (ac-bd) + (ad+bc)i
    public Complex multiply(Complex c) {
        double newReal = this.real * c.real - this.imag * c.imag;
        double newImag = this.real * c.imag + this.imag * c.real;
        return new Complex(newReal, newImag);
    }

    // 10. toString
    public String toString() {
        if (imag >= 0)
            return real + " + " + imag + "i";
        else
            return real + " - " + (-imag) + "i"; 
    } 
} 
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);   // 3 + 4i
        Complex c2 = new Complex(1, -2);  // 1 - 2i

        // Getters use karke print
        System.out.println("c1 real: " + c1.getReal()); 
        System.out.println("c1 imag: " + c1.getImag());

        // Setters use karke change
        c1.setReal(5);
        System.out.println("New c1 = " + c1); // 5 + 4i

        Complex sum = c1.add(c2);
        System.out.println("Sum = " + sum);
    }
}
    }
}
