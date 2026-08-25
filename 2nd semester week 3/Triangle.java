public class Triangle {
    private Point p1, p2, p3;

    public Triangle() {
        p1 = new Point(0, 0);
        p2 = new Point(1, 0);
        p3 = new Point(0, 1);
    }

    public Triangle(Point a, Point b, Point c) {
     this.p1 = new Point(a); 
     this.p2 = new Point(b);
     this.p3 = new Point(c);
    }


    public Triangle(Triangle t) {
        p1 = new Point(t.p1);
        p2 = new Point(t.p2);
        p3 = new Point(t.p3);
    }

    
    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }


    public void setP1(Point p1) { this.p1 = new Point(p1); }
    public void setP2(Point p2) { this.p2 = new Point(p2); }
    public void setP3(Point p3) { this.p3 = new Point(p3); }

    
    double getDistance(Point a, Point b) {
        double dx = b.getX() - a.getX();  
        double dy = b.getY() - a.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    
    public double perimeter() {
        double d1 = getDistance(p1, p2);
        double d2 = getDistance(p2, p3);
        double d3 = getDistance(p3, p1);
        return d1 + d2 + d3;
    }

    
    public String toString() {
        return "Triangle Points: " + p1 + " , " + p2 + " , " + p3;
    }
} 
public class Main {
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(new Point(0,0), new Point(3,0), new Point(0,4));
        
        t2.setP1(new Point(1,1)); 
        System.out.println("\n" + t2);
        System.out.println("Perimeter: " + t2.perimeter());
    }
}
    
