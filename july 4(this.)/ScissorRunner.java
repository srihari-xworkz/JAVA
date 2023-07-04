public class ScissorRunner{
    public static void main(String[] args) 
    {
        System.out.println("running main of ScissorRunner");
        Scissor ref1=new Scissor("Karen Kay");
        System.out.println("kabab name: "+ref1.brand);
        System.out.println("kabab name: "+ref1.color );
        System.out.println("kabab name: "+ref1.type);
        System.out.println("kabab name: "+ref1.usage);
        System.out.println("kabab name: "+ref1.size);
        System.out.println("kabab name: "+ref1.price);
        System.out.println("kabab name: "+ref1.material);


        Scissor ref2=new Scissor("Karen Kay","black");
        System.out.println("kabab name: "+ref2.brand);
        System.out.println("kabab name: "+ref2.color );
        System.out.println("kabab name: "+ref2.type);
        System.out.println("kabab name: "+ref2.usage);
        System.out.println("kabab name: "+ref2.size);
        System.out.println("kabab name: "+ref2.price);
        System.out.println("kabab name: "+ref2.material);


        Scissor ref3=new Scissor("Karen Kay","black","sharpestBlade");
        System.out.println("kabab name: "+ref3.brand);
        System.out.println("kabab name: "+ref3.color );
        System.out.println("kabab name: "+ref3.type);
        System.out.println("kabab name: "+ref3.usage);
        System.out.println("kabab name: "+ref3.size);
        System.out.println("kabab name: "+ref3.price);
        System.out.println("kabab name: "+ref3.material);

        Scissor ref4=new Scissor("Karen Kay","black","sharpestBlade","fabric");
        System.out.println("kabab name: "+ref4.brand);
        System.out.println("kabab name: "+ref4.color );
        System.out.println("kabab name: "+ref4.type);
        System.out.println("kabab name: "+ref4.usage);
        System.out.println("kabab name: "+ref4.size);
        System.out.println("kabab name: "+ref4.price);
        System.out.println("kabab name: "+ref4.material);

        Scissor ref5=new Scissor("Karen Kay","black","sharpestBlade","fabric",'S');
        System.out.println("kabab name: "+ref5.brand);
        System.out.println("kabab name: "+ref5.color );
        System.out.println("kabab name: "+ref5.type);
        System.out.println("kabab name: "+ref5.usage);
        System.out.println("kabab name: "+ref5.size);
        System.out.println("kabab name: "+ref5.price);
        System.out.println("kabab name: "+ref5.material);

        Scissor ref6=new Scissor("Karen Kay","black","sharpestBlade","fabric",'S',3194.45);
        System.out.println("kabab name: "+ref6.brand);
        System.out.println("kabab name: "+ref6.color );
        System.out.println("kabab name: "+ref6.type);
        System.out.println("kabab name: "+ref6.usage);
        System.out.println("kabab name: "+ref6.size);
        System.out.println("kabab name: "+ref6.price);
        System.out.println("kabab name: "+ref6.material);

        Scissor ref7=new Scissor("Karen Kay","black","sharpestBlade","fabric",'S',3194.45,"metal");
        System.out.println("kabab name: "+ref7.brand);
        System.out.println("kabab name: "+ref7.color );
        System.out.println("kabab name: "+ref7.type);
        System.out.println("kabab name: "+ref7.usage);
        System.out.println("kabab name: "+ref7.size);
        System.out.println("kabab name: "+ref7.price);
        System.out.println("kabab name: "+ref7.material);
    }

}
