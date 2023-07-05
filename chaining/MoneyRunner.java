public class MoneyRunner {
    public static void main(String[] args) {
        System.out.println("running main of MoneyRunner");
        Money ref1=new Money("india");
        System.out.println("country : "+ref1.country);
        System.out.println("currency : "+ref1.currency);
        System.out.println("denomination : "+ref1.denomination);
        System.out.println("type : "+ref1.type);


        Money ref2=new Money("india","rupee");
        System.out.println("country : "+ref2.country);
        System.out.println("currency : "+ref2.currency);
        System.out.println("denomination : "+ref2.denomination);
        System.out.println("type : "+ref2.type);


        Money ref3=new Money("india","rupee",7);
        System.out.println("country : "+ref3.country);
        System.out.println("currency : "+ref3.currency);
        System.out.println("denomination : "+ref3.denomination);
        System.out.println("type : "+ref3.type);

        Money ref4=new Money("india","rupee",7,2);
        System.out.println("country : "+ref4.country);
        System.out.println("currency : "+ref4.currency);
        System.out.println("denomination : "+ref4.denomination);
        System.out.println("type : "+ref4.type);
    }
}
