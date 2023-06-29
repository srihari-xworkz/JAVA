class Biscuit{
    int packets;
    String company="bourbon";
    String type;
    String tea="parle";
    Biscuit(){
        System.out.println("---Running constructor of Biscuit---");
    }
}

public class BiscuitRunner {
    public static void main(String[] args) {
        System.out.println(".....main method of Biscuit.....");
        Biscuit ref=new Biscuit();
        System.out.println("i currently have "+ref.packets+" packets");
        System.out.println("i like "+ref.company+" biscuit");
        System.out.println("type of biscuit is "+ref.type);
        System.out.println("with tea "+ref.tea+" biscuits suits well");
    } 
}