class candy{
    double count;
    String old="parle";
    String name="melody";
    String sweet;
    candy(){
        System.out.println("---Running constructor of Candy---");
    }
}

public class CandyRunner{
    public static void main(String[] args) {
        System.out.println(".....main method of Candy.....");
        candy ref=new candy();
        System.out.println(ref.count);
        System.out.println("one of the oldest candy is "+ref.old);
        System.out.println("i usually eat "+ref.name);
        System.out.println(ref.sweet);
    } 
}