class kabab{
    String name;
    double price;
    String hotelName;
    int noOfPieces;
    boolean takeAway;
    kabab(String name)
    {
        System.out.println("running kabab const with name ");
        this.name=name;
    }
     kabab(String name,double price)
    {
        System.out.println("running kabab const with name and price ");
        this.name=name;
        this.price=price;
    }
     kabab(String name,double price,String hotelName)
    {
        System.out.println("running kabab const with name,price and hotelname ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
    }
     kabab(String name,double price,String hotelName,int noOfPieces)
    {
        System.out.println("running kabab const with name,price,hotelName and noOfPieces ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
        this.noOfPieces=noOfPieces;
    }
     kabab(String name,double price,String hotelName,int noOfPieces,boolean takeAway)
    {
        System.out.println("running kabab const with name,price,hotelName,noOfPieces and takeAway ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
        this.noOfPieces=noOfPieces;
        this.takeAway=takeAway;
    }
}

