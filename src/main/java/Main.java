import ClassParams2Class.Pair;
import SimpleClass.Box;

public class Main {
    public static void main(String[] args) {
        Box boxWithoutRestrictions = new Box();
        Box<Integer> boxForIntegersOnly = new Box();
        boxForIntegersOnly.set(2);
        boxWithoutRestrictions.set("Hello");

        System.out.println("Box with integer input only output: " + boxForIntegersOnly.get());
        System.out.println("Box without restrictions output: " + boxWithoutRestrictions.get());
        System.out.println("");

        Pair<String, Integer> pair1 = new Pair("W",1);
        Pair<Integer,String> pair2 = new Pair(1, "W");
        Pair<String , String> pair3 = new Pair("W","WW.");

        System.out.println("pair1: "+ pair1.getK()+" "+pair1.getV());
        System.out.println("pair3: "+ pair3.getK() + " "+ pair3.getV());





    }
}
