public class Main {
    public static void main(String agr[]){
        double factor;
        for(Sprite s : sprites){
            if(s instanceof Zoomable){
                Zoomable z = (Zoomable)s;
                z.zoom(factor);
            }
        }
    }
    
}