public class Point {
    private double x, y;
    
    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    
    public Point add(Point p) {
        return new Point(this.x + p.x, this.y + p.y);
    }
    
    public Point subtract(Point p) {
        return new Point(this.x - p.x, this.y - p.y);
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
 public class testPoint {
    public static void main(String[] args) {

        Point a = new Point(1, 2);
        Point b = new Point(4, 6);
        Point c = new Point(b); 
        
        System.out.println("Point A: " + a);
        System.out.println("Point B: " + b);
        System.out.println("Point C copy of B: " + c);
        
        Point sum = a.add(b);
        Point diff = b.subtract(a);
        System.out.println("A + B = " + sum);
        System.out.println("B - A = " + diff);  
    } 
}
