public class Stove {
    String burnerType;
    String  bodyMaterial;
    int noOfBurners;
    int warranty;
    double width;
    boolean rustProof;
    String shape;
    String brand;

    Stove(String burnerType,String bodyMaterial,int noOfBurners,int warranty,double width,boolean rustProof,String shape,String brand)
    {
        System.out.println("running stove const all parameters");
        this.burnerType=burnerType;
        this.bodyMaterial=bodyMaterial;
        this.noOfBurners=noOfBurners;
        this.warranty=warranty;
        this.width=width;
        this.rustProof=rustProof;
        this.shape=shape;
        this.brand=brand;

    }
}
