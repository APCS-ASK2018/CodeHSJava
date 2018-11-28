public class RectangularPrism extends Solid
{
    // Code goes here!
    private double length, width, height;
    
    // When testing, values will be passed in this order: length, width, height
    public RectangularPrism(String name,double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double surfaceArea() {
        return 2 * (length * (width + height) + width * height);
    }
    public double volume() {
        return length * width * height;
    }
}
