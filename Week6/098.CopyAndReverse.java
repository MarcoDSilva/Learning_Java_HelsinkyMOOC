
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = reverseCopy(original);

        copied[0] = 99;

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copy: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];

        System.arraycopy(array, 0, copied, 0, array.length);

        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] copied = new int[array.length];

        int x = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            copied[x] = array[i];
            x++;
        }

        return copied;

    }

}