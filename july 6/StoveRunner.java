public class StoveRunner {
    public static void main(String[] args) {
        System.out.println("running main of StoveRunner");
        Stove stove = new Stove("brass", "glass", 4, 2, 575.50, true, "rectangle", "pigeon");
        System.out.println(stove.burnerType);
        System.out.println(stove.bodyMaterial);
        System.out.println(stove.noOfBurners);
        System.out.println(stove.warranty);
        System.out.println(stove.width);
        System.out.println(stove.rustProof);
        System.out.println(stove.shape);
        System.out.println(stove.brand);

        Stove stove2 = new Stove("iron", "steel", 2, 4, 400.50, false, "cuboidal", "prestige");
        System.out.println(stove2.burnerType);
        System.out.println(stove2.bodyMaterial);
        System.out.println(stove2.noOfBurners);
        System.out.println(stove2.warranty);
        System.out.println(stove2.width);
        System.out.println(stove2.rustProof);
        System.out.println(stove2.shape);
        System.out.println(stove2.brand);
    }
}
