import java.util.*;
public class Main {
    public static void main(String args[]){
        ArrayList<Shape> shapes2D = new ArrayList<Shape>();
		shapes2D.add(new Circle("G11",3.0));
		shapes2D.add(new Rectangle("G12",2.0,8.0));

		ArrayList<Shape> shapes3D = new ArrayList<Shape>();
		shapes3D.add(new Shpere("C1",3.0));
		shapes3D.add(new Cylinder("C2",3.0,2.0)); 
		shapes3D.add(new Cuboid("E1",2.0,8.0,3.0));
    }
    double total2D;

        Rectangle r =  new Rectangle("G12",2.0,8.0);
        total2D = a.getArea()+r.getArea();
        System.out.println("Toatl Area of 2D :" +total2D);
        System.out.println("Toatl Volume of 2D : 0" );


        System.out.println(" " );

        double totalArea3D,totalVol3D;
        Sphere s =   new Sphere("C",3.0);
        Cylinder cy = new Cylinder("D",3.0,2.0);
        Cuboid  cu =new Cuboid("E",2.0,8.0,3.0);

        totalArea3D =s.getArea()+cy.getArea()+cu.getArea();
        totalVol3D = s.getVolume()+cy.getVolume()+cu.getVolume();

        System.out.println("Toatl Area of 3D :" +totalArea3D);
        System.out.println("Toatl Volume of 3D : "+totalVol3D );
    
}