public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("running main of BottleRunner");
        Bottle ref1=new Bottle("milton");
        System.out.println("Bottle brand: "+ref1.brand);
        System.out.println("Bottle price is : "+ref1.price );
        System.out.println("Bottle name capacity is : "+ref1.capacity);
       

        Bottle ref2=new Bottle("milton",160);
        System.out.println("Bottle brand: "+ref2.brand);
        System.out.println("Bottle price is : "+ref2.price );
        System.out.println("Bottle name capacity is : "+ref2.capacity);
       

        Bottle ref3=new Bottle("milton",160,1);
        System.out.println("Bottle brand: "+ref3.brand);
        System.out.println("Bottle price is : "+ref3.price );
        System.out.println("Bottle name capacity is : "+ref3.capacity);
    }

}
