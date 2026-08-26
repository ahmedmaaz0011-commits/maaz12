import java.util.Objects; 
public class Point{
  private int x;
   private int y; 

  public Point(int x,int y){
   if(x<0||y<0){ 
    throw new IllegalArgumentException("X and Y must be greater than 0");
     this.x=x;
        this.y=y;
     }
   }
     
  public int getX(){
      return this.x;
    }  
    
  public int getY(){
      return this.y;
    }  
      
  public void setX(int x){
 if(x<0){    
  throw new IllegalArgumentException("X cannot be negative");    
 }  
    this.x=x;  
  }

  public void setY(int y){
 if(y<0){    
  throw new IllegalArgumentException("Y cannot be negative");    
 }  
    this.y=y;  
  }
  
  @override
  public String toString(){ 
    return ("+this.x+","+this.y+");  
  } 

 @override   
 public boolean equals(Objects obj){
  if(this==obj){ 
    return true;
  } 
  if(obj==null){ 
    return false;
  }
  if(getclass()!=obj.getclass()){ 
    return false;
  }
   Point other= (Point) obj; 
  return this.x==other.x && this.y==other.y 
 }

 @override
 public int hashcode(){ 
  return Objects.hash( 
    this.x,this.y 
  );
 }
}         

import java.util.objects; 
public class Circle implements Cloneable(){
private double radius;
private Point center; 
public static int Objectcount=0;
 
public Circle(){
  this.radius=1.0;
  this.center=new Point(0,0);  
}              
 
public Circle(double radius,Point ceneter){ 
   if(radius<=0){ 
    throw new IllegalArgumentException("Radius must be greater than 0");
   }
   if(center==0){
    throw new IllegalArgumentException("Ceneter cannot be null");
   } 
   this.radius=radius;
   this.center=center; 
   Objectcount++;    
}  

public double getRadius(){ 
  return this.radius;
}  

public Point getCenter(){ 
  return this.center;
}  

public void setRadius(double radius){ 
  if(radius<=0){ 
    throw new IllegalArgumentException("Radius must be greater than 0");
  }
   this.radius=radius;
}

public void setCenter(Point ceneter){ 
  if(center=0){ 
    throw new IllegalArgumentException("Center must be greater than 0");
  }
   this.ceneter=center;
}

public double getArea(){ 
  reutrn Math.PI*this.radius*this.radius;
}

public double getCircumference(){ 
  return 2*Math.PI*this.radius;
} 
 
public static int getObjectcount(){
   return Objectcount;
} 
 
public void display(){ 
  System.out.println("Radius="+ this.radius); 
  System.out.println("Center="+ this.center);  
  System.out.println("Area="+ this.getArea());   
  System.out.println("Circumference="+ this.getCircumference());    
} 
 
 @override  
public String toString(){ 
  return Circle (""radius="+this.radius+",""center="+this.center+");
}
 
 @override
public boolean equals(Objects obj){ 
  if(this==obj){ 
    return true;
  } 
  if(obj==null){ 
    return false;
  }
  if(getclass()!=obj.getclass()){
  return false; 
 }
  Circle other = (Circle) obj; 
  return Double.compare(this.radius,other.radius)==0 && (this.center==other.ceneter);
}
 
 @override
  public int hashcode(){ 
   return Objects.hash(this.radius,this.center);      
  } 
  @Override
public Circle clone() {

    try {
        return (Circle) super.clone();
    }
    catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
} 
}

public class Main {
public static void main(String[] args) {


 Point p1 = new Point(5,5);
 Circle c1 = new Circle(10, p1);

 Point p2 = new Point(5, 5);
 Circle c2 = new Circle(10, p2); 
 Circle c3 = new Circle();

 System.out.println("----- C1 DISPLAY -----");
c1.display();

 System.out.println("\n----- toString() -----");
 System.out.println(c1.toString());

 System.out.println("\n----- == -----");
 System.out.println(c1 == c2);


 System.out.println("\n----- equals() -----");
 System.out.println(c1.equals(c2));

 System.out.println("\n----- hashCode() -----");
 System.out.println(c1.hashCode());
 System.out.println(c2.hashCode());

 System.out.println("\n----- Object Count -----");
 System.out.println( Circle.getObjectCount());

 System.out.println("\n----- Setter -----");

 c3.setRadius(20);
 c3.setCenter( new Point(10, 10));
 System.out.println(c3);


 System.out.println("\n----- Null Check -----");
 Circle c4 = null;  
 if (c4 != null) {
  System.out.println( c4.getArea());
} else {
 System.out.println("c4 is null, so no method is called.");}
}
 System.out.println("\n--------Clone Check-------");
 Circle c2 = c1.clone();
 System.out.println(c1 == c2);
 System.out.println(c1.getCenter() == c2.getCenter());
}
