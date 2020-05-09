public class Rectangle extends Shape implements AreaCalculable{
    public double h;
    public double w;
    
    public Rectangle(String name,double h){
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
    public void zoom(double factor)
    {
        w = w*factor;
        h = h*factor;
    }
}