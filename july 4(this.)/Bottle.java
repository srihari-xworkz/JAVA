class Bottle{
    String brand;
    int price;
    int capacity;
    Bottle(String brand)
    {
        System.out.println("running bottle const with name ");
        this.brand=brand;
    }
    Bottle(String brand,int price)
    {
        System.out.println("running bottle const with name and price ");
        this.brand=brand;
        this.price=price;
    }
     Bottle(String brand,int price,int capacity)
    {
        System.out.println("running bottle const with name,price and capacity ");
        this.brand=brand;
        this.price=price;
        this.capacity=capacity;
    }
    
}

