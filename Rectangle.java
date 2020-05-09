public class Rectangle extends Shape implements AreaCalculable{
    public String h;
    public double w;
    
    public Rectangle(String name,Srting h){
        super(name);
        this.h = h;
    }
    public void  setH(double h){
        this.h;
    }
    public double getH(){
        return h;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}