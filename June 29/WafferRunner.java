class Waffer{
    String quantity;
    String name="lays";
    String flavour="onion";
    int cost;
    Waffer(){
        System.out.println("---Running constructor of Waffer---");
    }
}

public class WafferRunner{
    public static void main(String[] args) {
        System.out.println(".....main method of Waffer.....");
        Waffer slice=new Waffer();
        System.out.println(slice.quantity);
        System.out.println(slice.name);
        System.out.println(slice.flavour);
        System.out.println(slice.cost);
    } 
}