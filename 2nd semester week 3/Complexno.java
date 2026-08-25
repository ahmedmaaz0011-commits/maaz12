public class Complex {
    
    private double real;  
    private double imag;   

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imag = c.imag;
    }

    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex multiply(Complex c) {
        double newReal = this.real * c.real - this.imag * c.imag;
        double newImag = this.real * c.imag + this.imag * c.real;
        return new Complex(newReal, newImag);
    }

    public String toString() {
        if (imag >= 0)
            return real + " + " + imag + "i";
        else
            return real + " - " + (-imag) + "i"; 
    } 
} 
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);   
        Complex c2 = new Complex(1, -2);  

        System.out.println("c1 real: " + c1.getReal()); 
        System.out.println("c1 imag: " + c1.getImag());
        c1.setReal(5);
        System.out.println("New c1 = " + c1); 

        Complex sum = c1.add(c2);
        System.out.println("Sum = " + sum);
    }
}
    }
}
