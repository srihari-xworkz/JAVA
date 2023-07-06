public class PotRunner {
     public static void main(String[] args) {
        System.out.println("running main of PotRunner");
        Pot pot = new Pot("hanging", "circular", "plastic", 22, 20.00, 400, "india", true);
        System.out.println(pot.type);
        System.out.println(pot.material);
        System.out.println(pot.shape);
        System.out.println(pot.height);
        System.out.println(pot.diameter);
        System.out.println(pot.price);
        System.out.println(pot.origin);
        System.out.println(pot.cod);

        Pot pot2 = new Pot("planting", "cylinder", "clay", 25, 30.00, 500, "village", false);
        System.out.println(pot2.type);
        System.out.println(pot2.material);
        System.out.println(pot2.shape);
        System.out.println(pot2.height);
        System.out.println(pot2.diameter);
        System.out.println(pot2.price);
        System.out.println(pot2.origin);
        System.out.println(pot2.cod);
    }
}
