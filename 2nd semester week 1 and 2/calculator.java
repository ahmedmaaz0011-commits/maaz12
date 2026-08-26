public class Calculator {

    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }

    public double divide(double a, double b) { 
        if(b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; 
        }
        return a / b;
    }

    public double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    public double average(double... numbers) {
        if(numbers.length == 0) return 0; 
        double sum = 0;
        for(double n : numbers) sum += n;
        return sum / numbers.length;
    }

    public double add(double... numbers) {
        double total = 0;
        for(double n : numbers) total += n;
        return total;
    }

    public double maximum(double... numbers) {
        if(numbers.length == 0) return 0; 
        double max = numbers[0];
        for(double n : numbers) if(n > max) max = n;
        return max;
    }
}
System.out.println("\n--- Calculator Test ---");
        Calculator c = new Calculator();
        System.out.println("Normal: 5 + 3 = " + c.add(5,3)); 
        System.out.println("Power: 2^3 = " + c.power(2,3)); 
        System.out.println("Average: " + c.average(10,20,30)); 

        System.out.println("Edge: Divide by 0 = " + c.divide(10,0)); 
        System.out.println("Edge: Average empty = " + c.average()); 
        System.out.println("Varargs Add: " + c.add(1,2,3,4,5));
    }
}
