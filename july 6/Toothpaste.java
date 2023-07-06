public class Toothpaste {
    String idealfor;
    String model;
    int quantity;
    int minage;
    int maxage;
    int maxShelfLife;
    String genericname;
    String brand;

    Toothpaste(String idealfor,String model,int quantity,int minage,int maxage,int maxShelfLife,String genericname,String brand)
    {
        System.out.println("running stove const all parameters");
        this.idealfor=idealfor;
        this.model=model;
        this.quantity=quantity;
        this.minage=minage;
        this.maxage=maxage;
        this.maxShelfLife=maxShelfLife;
        this.genericname=genericname;
        this.brand=brand;

    }
}
