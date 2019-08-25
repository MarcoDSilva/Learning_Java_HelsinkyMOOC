
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};

        sort(values);

    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexSmall = index;
        int small = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
                indexSmall = i;
            }
        }
        return indexSmall;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            
            int starter = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, starter);
        }
    }
}
