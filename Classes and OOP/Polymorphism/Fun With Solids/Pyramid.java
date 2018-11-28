import java.lang.Math;

public class Pyramid extends Solid
{
    // Code goes here!
    private double length, width, height;
    
    // When testing, values will be passed in this order: length, width, height
    public Pyramid(String name,double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double surfaceArea() {
        return length * width
            + length * sqrt( sqr(width/2) + sqr(height) )
            + width * sqrt( sqr(length/2) + sqr(height) );
    }
    public double volume() {
        return length * width * height / 3;
    }
    
    private double sqr(double n) {return n * n;}
    private double sqrt(double n) {return Math.sqrt(n);}
}
