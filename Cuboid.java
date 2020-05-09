public class Cuboid extends Shape implements AreaCalculable {
    public String val;
    public Cuboid(String name){
        super(name);

    }
    public String splitString2(String key){
        key = name;
        Scanner s = new Scanner(new File("data.txt"));
        while(s.hashNextLine()){
            String line =s.nextLine();
            String item = line.split("_");
            if(item[0].equals(key)){
                val = item[1];
               return val;
            }
        }
    }
}