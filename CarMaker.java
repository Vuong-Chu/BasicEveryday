/**
 * This code is to review the class, constructor and inheritence.
 * @author vuongchu
 *
 */

public class CarMaker{
    public static void main(String[] args) {
        Car car = new Car(8,"Normal car");
        car.startEngine();
        car.accelerate();
        car.brake();
        
        Mitsubishi ms = new Mitsubishi(6, "Outlander VRX 4WD");
        ms.startEngine();
        ms.accelerate();
        ms.brake();
        
        Holden hd = new Holden(6, "Commodore");
        hd.startEngine();
        hd.accelerate();
        hd.brake();
        
        Ford fd = new Ford(6, "Ford Falcon");
        fd.startEngine();
        fd.accelerate();
        fd.brake();
        
    }
}


class Car {
    
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }
    
    public void startEngine() {
        System.out.println("Engine is starting...");
    }
    
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
    
    public void brake() {
        System.out.println("Car is braking...");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }
    
    public void startEngine() {
        System.out.println(this.getName() + " is starting...");
    }
    
    public void accelerate() {
        System.out.println(this.getName()+" is accelerating...");
    }
    
    public void brake() {
        System.out.println(this.getName()+" is braking...");
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    
    public void startEngine() {
        System.out.println(this.getName()+" is starting...");
    }
    
    public void accelerate() {
        System.out.println(this.getName()+" is accelerating...");
    }
    
    public void brake() {
        System.out.println(this.getName()+" is braking...");
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    
    public void startEngine() {
        System.out.println(this.getName()+" is starting...");
    }
    
    public void accelerate() {
        System.out.println(this.getName()+" is accelerating...");
    }
    
    public void brake() {
        System.out.println(this.getName()+" is braking...");
    }
}


