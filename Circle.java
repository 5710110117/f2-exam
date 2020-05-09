public class Circle extends Shape implements AreaCalculable {
    public double r;
    public String radius;
    public Circle(double radius){
        super(name);
        this.radius = radius;
    }
    public int splitString(String key){
        int total = 0;
        int r;
        Scanner s = new Scanner(new File("data.txt"));
        while(s.hashNextLine()){
            String line =s.nextLine();
            String item = line.split("_");
            if(item[0].equals(key)){
                r = Integer.parseInt(item[1]);
                return r;
            }
        }
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