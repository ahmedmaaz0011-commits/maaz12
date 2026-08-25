 public class Car {
    private String brand;
    private String color;
    private boolean engineOn;
    private int speed;
    private int fuelLevel; 
    private int gear; 
    private boolean headlightsOn;

    public Car() {
        brand = "Unknown";
        color = "White";
        engineOn = false;
        speed = 0;
        fuelLevel = 100;
        gear = 0;
        headlightsOn = false;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println(brand + " engine ON");
    }

    public void stopEngine() { 
        engineOn = false;
        speed = 0;
        gear = 0;
        System.out.println(brand + " engine OFF. Speed reset to 0");
    }

    
    public void drive() {
        if(engineOn) { speed = 30; gear = 2; System.out.println(brand + " driving at " + speed); }
        else System.out.println("Engine is OFF");
    }
    public void moveFast() {
        if(engineOn) { speed += 20; if(gear<5) gear++; System.out.println("Speed: " + speed); }
        else System.out.println("Cannot accelerate. Engine OFF"); // sensible rule
    }
    public void moveSlow() {
        if(engineOn) { speed -= 10; if(speed<0) speed=0; System.out.println("Speed: " + speed); }
    }
    public void moveLeft() { if(engineOn) System.out.println(brand + " turning LEFT"); }
    public void moveRight() { if(engineOn) System.out.println(brand + " turning RIGHT"); }

    
    public void turboMode() {
        if(engineOn && fuelLevel>20) {
            speed += 50;
            fuelLevel -= 20;
            System.out.println("TURBO!!! New Speed: " + speed);
        }
    }

    public void displayState() {
        System.out.println(brand + " | Speed:" + speed + " | Gear:" + gear + " | Fuel:" + fuelLevel + "%");
    }
}
[11:58 AM, 8/25/2026] Maaz: public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setDetails("BMW", "Black");
        car2.setDetails("Tesla", "Red");

        car1.startEngine();
        car1.moveFast();
        car1.turboMode();
        car1.displayState();

        car2.startEngine();
        car2.drive();
        car2.moveLeft();
        car2.displayState();

        car1.stopEngine(); 
        car1.displayState();

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
