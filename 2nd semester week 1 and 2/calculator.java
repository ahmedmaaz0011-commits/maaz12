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
        if(numbers.length == 0) return 0; // edge case
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
        if(numbers.length == 0) return 0; // edge case
        double max = numbers[0];
        for(double n : numbers) if(n > max) max = n;
        return max;
    }
}
