public abstract class Shape
{
    private String name;
    
    public Shape(String name)
    {
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}
