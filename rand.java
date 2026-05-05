import java.util.Random;
import java.util.Arrays;
class rand {
    public static void main(String[] args) {

        Random rm = new Random();

        int n = rm.nextInt(6);
        System.out.println(n);

        boolean b = rm.nextBoolean();
        System.out.println(b);

        double g = 10 + (2 * rm.nextGaussian());
        System.out.println(g);

        byte bt[] = new byte[5];
        System.out.println(Arrays.toString(bt));
        rm.nextBytes(bt);
        System.out.println(Arrays.toString(bt));
    }
}