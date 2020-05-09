public class Cylinder extends Shape implements AreaCalculable,VolumeCalculable{
    public double radius;
    public double height;
    public Cylinder(String name,double radius,double height)
    {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public double getArea(){
		return Math.PI * radius * radius * height;
    }
    
    public double getVolume(){
		return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public void zoom(double factor)
    {
        radius = radius*factor;
    }
}