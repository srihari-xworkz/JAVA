class Bread{
    String name;
    String taste="sugarless";
    int slice=15;
    String eat;
    Bread(){
        System.out.println("---Running constructor of Bread---");
    }
}

public class BreadRunner{
    public static void main(String[] args) {
        System.out.println(".....main method of Bread.....");
        Bread var=new Bread();
        System.out.println(var.name);
        System.out.println(var.taste);
        System.out.println(var.slice);
        System.out.println(var.eat);
    } 
}