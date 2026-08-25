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

import java.util.Object; 
public class Rectangle implements Cloneable{  
  private int length; 
  private int breadth; 
  private Point topleft; 
  private Point bottomright; 
  private static objectcount++;
   
 public Rectangle(){ 
    this.length=1; 
    this.breadth=1; 
    this.topleft=new Point(0,0);
    this.bottomright=new Point(1,1); 
    objectcount++; 
 } 

  public Rectangle(int length,int breadth){  
      if(length<=0||breadth<=0){ 
        throw new IllegalArgumentException("length and breadth must be greater than 0");
      }
       this.length=length; 
       this.breadth=breadth; 
       this.topleft=new Point(0,0);    
       this.bottomright=new Point(length,breadth); 
       objectcount++; 
 } 
 
 public int getlength(){
     return this.length;
 }
 public int getbreadth(){ 
    return this.breadth; 
 }    
public Point gettopleft(){
     return this.topleft;
 }       
public Point getbottomright(){ 
    return this.bottomright;
}      
public void setlength(int length){ 
    if(length<=0){ 
    throw new IllegalArgumentException("length must  be greater than 0");
    } 
    this.length=length;
    this.bottomright.setX(length);   
}       
public void setbreadth(int breadth){ 
    if(breadth<=0){ 
    throws new IllegalArgumentException("breadth must  be greater than 0");
    } 
    this.breadth=breadth;
    this.bottomright.setY(breadth);   
}               
         
public int getArea(){ 
    return this.length*this.breadth;
}
            
public int getPerimeter(){ 
    return 2*(this.length*this.breadth);
}                     
            
public static int getObjectCount(){ 
    return objectcount;
}             

public void display(){ 
 System.out.println("Length="+this.length);    
 System.out.println("Breadth="+this.breadth);
 System.out.println("Area="+this.getArea);
 System.out.println("Perimeter="+this.getPerimeter); 
 System.out.println("TopLeft="+this.topleft);   
 System.out.println("BottomRight="+this.bottomright);
 }      
  
 @override 
 public String toString(){ 
  return Rectangle{"+"Length="+this.length +",Breadth="+this.breadth +", 
  TopLeft="this.topleft+",BottomRight="this.bottomright +"};      
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
     Rectangle other=(Rectangle) obj;
      return this.length==other.length&& 
      this.breadth==other.breadth 
      &&Objects.equals(this.topleft,other.topleft)
      &&Objects.equals(this.bottomright,other.bottomright);
  }
        
@override      
   public int hashcode(){ 
     return Objects.hash(this.length,this.breadth,this.topleft,this.bottomright) 
   }  

@Override
public Rectangle clone() {

    try {
        return (Rectangle) super.clone();
    }
    catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
} 
}

public class Main{
 public static void public static void main (String[] args) {
    Rectangle r1 = new Rectangle(10,5); 
    Rectangle r2 = new Rectangle(10,5);
    Rectangle r3 = new Rectangle();
      System.out.println("------------R1 DISPLAY------"); 
      r1.display();
      System.out.println("\n-----------toString()---------"); 
      System.out.println(r1.toString()); 
      System.out.println("\n------------==-----------");
      System.out.println(r1==r2);
      System.out.println("\n---------equals()---------");
      System.out.println(r1.equals(r2));   
      System.out.println("\n----------hashcode()------------"); 
      System.out.println(r1.hashcode()); 
      System.out.println(r2.hashcode()); 
      System.out.println("\n---------ObjectCount--------"); 
      Rectangle.getObjectCount(); 
      System.out.println("\n------Setter---------"); 
      r3.setlength(20); 
      r3.setbreadth(10); 
      System.out.println(r3); 
      System.out.println("\n------------Null Check-------------"); 
      Rectangle r4 = null; 
      if(r4!=null){ 
      System.out.printl(r4.getArea()); 
}
} 
else{ 
     System.out.println("r4 is null, so no method is called"); 
}

    System.out.println("\n-------Clone Check--------");
    Rectangle r2 = r1.clone();
    System.out.println(r1 == r2);
 }
 
