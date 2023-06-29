class Bun{
    int count;
    String quality="good";
    String kindof="cream";
    boolean veg;
    Bun(){
        System.out.println("---Running constructor of Bun---");
    }
}

public class BunRunner{
    public static void main(String[] args) {
        System.out.println(".....main method of Bun.....");
        Bun example=new Bun();
        System.out.println(example.count);
        System.out.println(example.quality);
        System.out.println(example.kindof);
        System.out.println(example.veg);
    } 
}