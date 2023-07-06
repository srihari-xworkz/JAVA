public class ToothpasteRunner {
    public static void main(String[] args) {
        System.out.println("running main of StoveRunner");
        Toothpaste toothpaste = new Toothpaste("all", "freshner", 600, 2, 100, 2, "toothpastes", "closeup");
        System.out.println(toothpaste.idealfor);
        System.out.println(toothpaste.model);
        System.out.println(toothpaste.quantity);
        System.out.println(toothpaste.minage);
        System.out.println(toothpaste.maxage);
        System.out.println(toothpaste.maxShelfLife);
        System.out.println(toothpaste.genericname);
        System.out.println(toothpaste.brand);

        Toothpaste toothpaste2 = new Toothpaste("children", "cleaner", 300, 1, 8, 1, "childrenCommodity", "chicco");
        System.out.println(toothpaste2.idealfor);
        System.out.println(toothpaste2.model);
        System.out.println(toothpaste2.quantity);
        System.out.println(toothpaste2.minage);
        System.out.println(toothpaste2.maxage);
        System.out.println(toothpaste2.maxShelfLife);
        System.out.println(toothpaste2.genericname);
        System.out.println(toothpaste2.brand);
    }
}
