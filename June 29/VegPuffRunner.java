class VegPuff{
    double cost=30.50;
    String like;
    boolean veg=true;
    String healthy;
    VegPuff(){
        System.out.println("---Running constructor of VegPuff---");
    }
}

public class VegPuffRunner {
    public static void main(String[] args) {
        System.out.println(".....main method of VegPuff.....");
        VegPuff puff=new VegPuff();
        System.out.println("cost of one vegpuff is "+puff.cost+" rs");
        System.out.println("i like "+puff.like);
        System.out.println("is vegpuff really veg "+puff.veg);
        System.out.println("is this healthy "+puff.healthy);
    } 
}