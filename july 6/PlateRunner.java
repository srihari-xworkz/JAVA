public class PlateRunner {
    public static void main(String[] args) {
        System.out.println("running main of PlateRunner");
        Plate plate = new Plate("Silver", "stainless", "round", 12, 12.00, 370, "snacks", false);
        System.out.println(plate.color);
        System.out.println(plate.model);
        System.out.println(plate.shape);
        System.out.println(plate.inBox);
        System.out.println(plate.diameter);
        System.out.println(plate.orders);
        System.out.println(plate.usage);
        System.out.println(plate.disposable);
        
        Plate plate2 = new Plate("Blue", "steel", "Circle", 5, 7.2, 15, "breakfast", false);
        System.out.println(plate2.color);
        System.out.println(plate2.model);
        System.out.println(plate2.shape);
        System.out.println(plate2.inBox);
        System.out.println(plate2.diameter);
        System.out.println(plate2.orders);
        System.out.println(plate2.usage);
        System.out.println(plate2.disposable);
    }
}
