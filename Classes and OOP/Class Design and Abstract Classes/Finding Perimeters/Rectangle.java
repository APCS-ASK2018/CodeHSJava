public class Rectangle extends Shape
{
    private double width;
    private double height;
    
    public Rectangle(String name, double width, double height)
    {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height)
    {
        this("Rectangle", width, height);
    }
    
    @Override
    public double getArea()
    {
        return width * height;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
