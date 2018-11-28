import java.lang.Math;

public class Sphere extends Solid
{
    // Code goes here!
    private double radius;
    
    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    public double volume() {
        return 4 * Math.PI * radius * radius * radius / 3;
    }
}
