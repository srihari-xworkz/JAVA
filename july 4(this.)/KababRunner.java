public class KababRunner{
    public static void main(String[] args) 
    {
        System.out.println("running main of kababRunner");
        kabab ref1=new kabab("Seekh Kebab");
        System.out.println("kabab name: "+ref1.name);
        System.out.println("kabab name: "+ref1.price );
        System.out.println("kabab name: "+ref1.hotelName);
        System.out.println("kabab name: "+ref1.noOfPieces);
        System.out.println("kabab name: "+ref1.takeAway);


        kabab ref2=new kabab("Seekh Kebab",120.50);
        System.out.println("kabab name: "+ref2.name);
        System.out.println("kabab name: "+ref2.price );
        System.out.println("kabab name: "+ref2.hotelName);
        System.out.println("kabab name: "+ref2.noOfPieces);
        System.out.println("kabab name: "+ref2.takeAway);


        kabab ref3=new kabab("Seekh Kebab",120.50,"Mandya");
        System.out.println("kabab name: "+ref3.name);
        System.out.println("kabab name: "+ref3.price );
        System.out.println("kabab name: "+ref3.hotelName);
        System.out.println("kabab name: "+ref3.noOfPieces);
        System.out.println("kabab name: "+ref3.takeAway);

        kabab ref4=new kabab("Seekh Kebab",120.50,"Mandya",2);
        System.out.println("kabab name: "+ref4.name);
        System.out.println("kabab name: "+ref4.price );
        System.out.println("kabab name: "+ref4.hotelName);
        System.out.println("kabab name: "+ref4.noOfPieces);
        System.out.println("kabab name: "+ref4.takeAway);

        kabab ref5=new kabab("Seekh Kebab",120.50,"Mandya",2,true);
        System.out.println("kabab name: "+ref5.name);
        System.out.println("kabab name: "+ref5.price );
        System.out.println("kabab name: "+ref5.hotelName);
        System.out.println("kabab name: "+ref5.noOfPieces);
        System.out.println("kabab name: "+ref5.takeAway);
    }

}
