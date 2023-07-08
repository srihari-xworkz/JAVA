class Owner
{
    String name;
    String ownwershipOf;
    double wealth;
    int noOfBuildings;
    int noOfCars;

    Owner(String name,String ownershipOf,double wealth,int noOfBuildings,int noOfCars)
    {
        this.name=name;
        this.ownwershipOf=ownershipOf;
        this.wealth=wealth;
        this.noOfBuildings=noOfBuildings;
        this.noOfCars=noOfCars;
    }

    void displayOwner()
    {
        System.out.println(name);
        System.out.println(ownwershipOf);
        System.out.println(wealth);
        System.out.println(noOfBuildings);
        System.out.println(noOfCars);
    }
}

public class OwnerRunner {
    public static void main(String[] args) {
        System.out.println("running main of OwnerRunner");
        Owner owner = new Owner("ambani", "reliance", 83.40, 1, 50);
        owner.displayOwner();
        System.out.println("after updating variables of owner");
        owner.name="adani";
        owner.ownwershipOf="ports";
        owner.wealth=6.80;
        owner.noOfBuildings=3;
        owner.noOfCars=30;
        owner.displayOwner();
    }  
}
