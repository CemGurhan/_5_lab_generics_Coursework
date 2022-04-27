package SimpleClass;

public class Main {
    public static void main(String[] args) {
        Box boxWithoutRestrictions = new Box();
        Box<Integer> boxForIntegersOnly = new Box();
        boxForIntegersOnly.set(2);
        boxWithoutRestrictions.set("Hello");

        System.out.println("Box with integer input only output: " + boxForIntegersOnly.get());
        System.out.println("Box without restrictions output: " + boxWithoutRestrictions.get());


    }
}
