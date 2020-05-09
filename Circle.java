public class Circle extends Shape implements AreaCalculable {
    public double r;
    public String radius;
    public Circle(double radius){
        super(name);
        this.radius = radius;
    }
    public int splitString(String key){

    }
    
    public void setRadius(String radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    

    public double getArea(){
        return Math.PI*radius*radius;
    }
}