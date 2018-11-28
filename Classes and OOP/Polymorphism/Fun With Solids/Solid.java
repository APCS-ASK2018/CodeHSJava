public abstract class Solid
{
    private String myName;

    public Solid(String name)
    {
        myName = name;
    }

    public String getName()
    {
        return myName;
    }

    public abstract double volume();

    public abstract double surfaceArea();
}
