class IceCream{
    String varieant="choco";
    String kind="cone";
    int price;
    String tasty;
    IceCream(){
        System.out.println("---Running constructor of IceCream---");
    }
}

public class IceCreamRunner {
    public static void main(String[] args) {
        System.out.println(".....main method of IceCream.....");
        IceCream candy=new IceCream();
        System.out.println(candy.varieant);
        System.out.println(candy.kind);
        System.out.println(candy.price);
        System.out.println(candy.tasty);
    } 
}