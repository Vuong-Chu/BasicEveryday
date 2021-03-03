/**
 * This code is to review the class, constructor and inheritence.
 * @author vuongchu
 *
 */

public class cyliderCircle{
    public static void main(String[] args) {
        Circle cir = new Circle(3.75);
        System.out.println(cir.getRadius());
        System.out.println(cir.getArea());
        
        Cylinder cyl = new Cylinder(7.25, 5.55);
        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
        System.out.println(cyl.getArea());
        System.out.println(cyl.getVolume());
        
    }
}

class Circle{
    private double radius;
    public Circle(double radius) {
        if(radius<0) {
            this.radius = 0;
        }else {
            this.radius = radius;
        }
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}

class Cylinder extends Circle{
    private double height;
    
    public Cylinder(double height, double radius) {
        super(radius);
        if(height<0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getVolume() {
       return super.getArea()*height;
    }
}

