public class SofaRunner {
    public static void main(String[] args) {
        System.out.println("running main of SofaRunner");
        Sofa sofa = new Sofa("jute", "foam", 6, 2, 8000.50, 3, "brown", "wakesure");
        System.out.println(sofa.fabric);
        System.out.println(sofa.material);
        System.out.println(sofa.width);
        System.out.println(sofa.height);
        System.out.println(sofa.cost);
        System.out.println(sofa.seater);
        System.out.println(sofa.color);
        System.out.println(sofa.brand);

        Sofa sofa2 = new Sofa("Leather", "Wood", 80, 120, 1200.0, 3, "grey", "woodland");
        System.out.println(sofa2.fabric);
        System.out.println(sofa2.material);
        System.out.println(sofa2.width);
        System.out.println(sofa2.height);
        System.out.println(sofa2.cost);
        System.out.println(sofa2.seater);
        System.out.println(sofa2.color);
        System.out.println(sofa2.brand);
    }
}
