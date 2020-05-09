public static void zoomAll(ArrayList<Sprite> sprites, double factor){
    for(Sprite s : sprites){
        if(s instanceof Zoomable){
            Zoomable z = (Zoomable)s;
            z.zoom(factor);
        }
    }

}