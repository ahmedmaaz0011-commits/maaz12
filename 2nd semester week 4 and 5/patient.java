import java.util.Objects;
public class Address{ 
private string city;
private string area; 

public Address(string city,string area){ 
    if(city==null||area==null){ 
    throw new IllegalArgumentException("CITY and AREA cannot be null");
}
   this.city=city;
   this.area=area;
}
      
public String getCity(){
    return this.city; 
}

public String getArea(){
    return this.area; 
}

public void setCity(string city); 
if(city==null){ 
   throw new IllegalArgumentException("CITY cannot be null"); 
  this.city=city;
}

public void setArea(string area); 
if(area==null){ 
   throw new IllegalArgumentException("AREA cannot be null"); 
  this.area=area;
}

@override
public String toString(){
 return ("this.city+","this.area+"); 
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
Address other = (Address) obj;
return Objects.equals(this.city==other.city) && Objects.equals(this.area==other.area);
} 

@override 
public int hashcode(){
   return Objects.hash(this.city,this.area);  
}
}

import java.util.Objects; 
public class Patient{
private String name;
private int age; 
private int patientid; 
private Address address; 
private static int objectcount=0;

public Patient(){ 
  this.name=unknown; 
  this.age=1; 
  this.patientid=1;
  this.address=new Address(unknown,unknown);
  objectcount++;           
}

public Patient(string name,int age,int patientid,Address address){ 
if(name==null||name.isEmpty()){ 
  throw new IllegalArgumentException("NAME cannot be null or empty");  
} 
if(age<=0){ 
  throw new IllegalArgumentException("AGE cannot be zero or less than 0");  
}
if(patientid<0){ 
  throw new IllegalArgumentException("ID cannot be negative");  
}
if(address==null){ 
  throw new IllegalArgumentException("Address cannot be null");  
}
this.name=name;
this.age=age; 
this.patientid=patientid;
this.address=address;  
objectcount++; 
}

public String getName(){ 
   return this.name; 
}

public int getAge(){ 
   return this.age;  
} 

public int getPatientId(){ 
   return this.patientid; 
}  

public Address getAddress(){ 
    return this.address;
}

public void setName(String name){ 
  if(name==null||name.isEmpty()){ 
  throw new IllegalArgumentException("NAME cannot be null or empty");  
} 
this.name=name;   
}
 
public void setAge(int age){ 
  if(age<=0){ 
  throw new IllegalArgumentException("AGE cannot be zero or less than 0");  
}   
this.age=age;    
} 

public void setPatientId(int patientid){ 
if(patientid<0){ 
  throw new IllegalArgumentException("ID cannot be negative");  
}
this.patientid=patientid;     
}

public void setaddresss(Address address){ 
if(address==null){ 
  throw new IllegalArgumentException("Address cannot be null");  
}   
this.address=address;
}

public void display(){
System.out.println("Name=" + this.name);     
System.out.println("Age="= + this.age);       
System.out.println("PatientId=" + this.patientid);        
System.out.println("Address=" + this.address);         
}
 
public static int Objectcount(){ 
    return objectcount;
} 

@override 
public String toString(){ 
  return Patient("+PatientId="+this.patientid+"Name="+this.name+"Age="+this.age+"Address="+this.address);   
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
Patient other= (Patient) obj; 
return this.age==other.age && this.patientid==other.patientid 
    &&Objects.equals(this.name,other.name) && Objects.equals(this.address==other.addres);
} 
 
@override 
public int hashcode(){
   return Objects.hash(this.age,this.name,this.patientid,this.address);   
} 
  @Override
public Patient clone() {

 try {

 Patient copy = (Patient) super.clone();
 copy.address = new Address(this.address.getCity(),this.address.getArea());
 return copy;
}
  catch (CloneNotSupportedException e) {
  throw new AssertionError();
    }
}     
}

public class Main(){
  public static void main(String[] args){
     Address a1 = new Address( "Karachi", "Gulshan");
     Patient p1 = new Patient( "Ali",20,101,a1);
     Address a2 = new Address("Karachi","Gulshan");
     Patient p2 = new Patient("Ali",20,101,a2);
     Patient p3 = new Patient();
        
      System.out.println("----- P1 DISPLAY -----");
      p1.display();

      System.out.println("\n----- toString() -----");
      System.out.println(p1);

      System.out.println("\n----- == -----");
      System.out.println(p1 == p2);

      System.out.println("\n----- equals() -----");
      System.out.println(p1.equals(p2));

      System.out.println("\n----- hashCode() -----");
      System.out.println(p1.hashCode());
      System.out.println(p2.hashCode());

      System.out.println("\n----- Object Count -----");
      System.out.println(Patient.getObjectCount());

        System.out.println("\n----- Setter -----");
        p3.setName("Ahmed");
        p3.setAge(25);
        p3.setPatientId(103);
        p3.setAddress(new Address("Lahore","Model Town"));
        System.out.println(p3);

        System.out.println("\n----- Null Check -----");
        Patient p4 = null;
        if (p4 != null) {
        System.out.println(p4.getName());
        } 
        else {
          System.out.println("p4 is null, so no method is called.);
        }
    }
       System.out.println("\n--------Clone Check--------");
        Patient p2 = p1.clone();
        System.out.println(p1 == p2);
        System.out.println(p1.getAddress() == p2.getAddress());
 } 
     
