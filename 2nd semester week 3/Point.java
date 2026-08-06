public class Point {
    // 1. Instance variables
    private double x, y;
    
    // 2. Default Constructor
    public Point() {
        x = 0;
        y = 0;
    }
    
    // 3. Parameterized Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // 4. Copy Constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    // 5. Getter methods
    public double getX() { return x; }
    public double getY() { return y; }
    
    // 6. Addition of points
    public Point add(Point p) {
        return new Point(this.x + p.x, this.y + p.y);
    }
    
    // 7. Subtraction of points
    public Point subtract(Point p) {
        return new Point(this.x - p.x, this.y - p.y);
    }
    
    // 8. toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
 public class testPoint {
    public static void main(String[] args) {
        // Test Point class
        Point a = new Point(1, 2);
        Point b = new Point(4, 6);
        Point c = new Point(b); // copy constructor
        
        System.out.println("Point A: " + a);
        System.out.println("Point B: " + b);
        System.out.println("Point C copy of B: " + c);
        
        Point sum = a.add(b);
        Point diff = b.subtract(a);
        System.out.println("A + B = " + sum);
        System.out.println("B - A = " + diff);  
    } 
}
