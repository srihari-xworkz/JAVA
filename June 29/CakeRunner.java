class Cake{
    int price;
    String cake="blackforest";
    String flavour="vanilla";
    int cost ;
    Cake(){
        System.out.println("---Running constructor of Cake---");
    }
}

public class CakeRunner {
    public static void main(String[] args) {
        System.out.println("main method of Cake.....");
        Cake sugar=new Cake();
        System.out.println("cake price is "+sugar.price);
        System.out.println("i like "+sugar.cake);
        System.out.println("flavour is "+sugar.flavour);
        System.out.println("cake cost is "+sugar.cost);
    } 
}