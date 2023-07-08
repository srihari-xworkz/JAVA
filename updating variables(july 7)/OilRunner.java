class Oil{
    String brand;
    int cost;
    double quantity;
    double toBeFilled;
    String applicableFor; 

    Oil(String brand,int cost,double quantity,double toBeFilled,String applicableFor)
    {
        System.out.println("running constructot with all arguments");
        this.brand=brand;
        this.cost=cost;
        this.quantity=quantity;
        this.toBeFilled=toBeFilled;
        this.applicableFor=applicableFor;
    }

    void displayOil()
    {
        System.out.println(brand);
        System.out.println(cost);
        System.out.println(quantity);
        System.out.println(toBeFilled);
        System.out.println(applicableFor);
    }
}


class OilRunner{
    public static void main(String[] args) {
        System.out.println("running main of OilRunner");
        Oil oil = new Oil("castrol",1800,1.25,2.50,"bike");
        oil.displayOil();
        System.out.println("after updating variables");
        oil.brand="servo";
        oil.cost=2000;
        oil.quantity=2.00;
        oil.toBeFilled=3.50;
        oil.applicableFor="car";
        oil.displayOil();
    }
}
