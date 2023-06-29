class Sweet{
    String name="gulabjamun";
    int numbers;
    String favourite="halwa";
    String famous;
    Sweet(){
        System.out.println("---Running constructor---");
    }
}

public class SweetRunner {
    public static void main(String[] args) {
        System.out.println("main method .....");
        Sweet desc=new Sweet();
        System.out.println("sweet name is "+desc.name);
        System.out.println("number of sweets is "+desc.numbers);
        System.out.println("favourite sweet is "+desc.favourite);
        System.out.println("famous sweet is "+desc.famous);
    } 
}