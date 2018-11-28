import java.lang.Math;

public class Cylinder extends Solid
{
    // Code goes here!
    private double radius, height;
    
    // When testing, values will be passed in this order: length, width, height
    public Cylinder(String name,double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }
    
    public double surfaceArea() {
        return 2 * radius * Math.PI * (height + radius);
    }
    public double volume() {
        return radius * radius * Math.PI * height;
    }
}
