public class Square extends Rectangle
{
    public Square(double sideLength)
    {
        super("Square", sideLength, sideLength);
    }
    
    public double getSideLength()
    {
        return super.getHeight();
    }
}
