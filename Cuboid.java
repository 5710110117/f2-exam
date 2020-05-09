import java.util.Scanner;
public class Cuboid extends Shape implements AreaCalculable{
    public double lenght;
    public double width;
    public double height;
    public Cuboid(String name,double lenght,double width,double height){
        super(name);
        this.lenght = lenght;
        this.width = width;
        this.height = height;

    }
    public double getArea(){
		return (2*height)*(lenght + width);
    }
    public double getVolume(){
        return width * height * lenght;
    }
    public void zoom(double factor)
    {
        width = width*factor;
        lenght = lenght*factor;
        height = height*factor;
    }
    
}