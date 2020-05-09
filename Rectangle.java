public class Rectangle extends Shape implements AreaCalculable{
    public String h;
    public double w;
    
    public Rectangle(String name,Srting h){
        super(name);
        this.h = h;
    }

    public void  setw(double w){
        this.w =w;
    }

    public double getw(){
        return w;
    }

    public double getArea(){
        return h*w;
    }
}