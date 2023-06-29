class Choclate{
    int cost=10;
    String like="5tar";
    String energy="perk";
    String taste;
    Choclate(){
        System.out.println("---Running constructor of Candy---");
    }
}

public class ChoclateRunner{
    public static void main(String[] args) {
        System.out.println(".....main method of Candy.....");
        Choclate choc=new Choclate();
        System.out.println("one normal choclate costs "+choc.cost);
        System.out.println("i prefer "+choc.like);
        System.out.println("i usually eat "+choc.energy);
        System.out.println(choc.taste);
    } 
}