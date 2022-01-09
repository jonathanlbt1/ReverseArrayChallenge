import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] thisArray = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(thisArray));
        reverse(thisArray);

    }

    private static void reverse(int[] array) {

        int maxIndex = array.length - 1;

        for(int i = 0; i < array.length; i++) {
            array[i] = array[maxIndex - i];
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
