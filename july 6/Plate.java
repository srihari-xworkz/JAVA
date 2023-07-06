public class Plate {
    String color;
    String model;
    String shape;
    int inBox;
    double diameter;
    int orders;
    String usage;
    boolean disposable;

    Plate(String color,String model,String shape,int inBox,double diameter,int orders,String usage,boolean disposable)
    {
        System.out.println("running sofa const all parameters");
        this.color=color;
        this.model=model;
        this.shape=shape;
        this.inBox=inBox;
        this.diameter=diameter;
        this.orders=orders;
        this.usage=usage;
        this.disposable=disposable;

    }
}
