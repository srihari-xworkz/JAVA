class Pot{
    String type;
    String shape;
    String material;
    int height;
    double diameter;
    int price;
    String origin;
    boolean cod;

    Pot(String type,String shape,String material,int height,double diameter,int price,String origin,boolean cod)
    {
        System.out.println("running Pot const all parameters");
        this.type=type;
        this.shape=shape;
        this.material=material;
        this.height=height;
        this.diameter=diameter;
        this.price=price;
        this.origin=origin;
        this.cod=cod;

    }
}