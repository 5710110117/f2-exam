public abstract class Shape {
    public String name;

    public Shape(String name)
    {
    this.name =name;
    }
    public String getName(){
        return name;
    }
    public abstract double splitString(String key);
    public abstract String splitString2(String key);
}