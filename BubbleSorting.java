package bubblesorting;

/**
 *
 * @author James
 */
public class BubbleSorting {

    public static void main(String[] args) {

        int[] values = {30, 3, 15, 26, 2};
        int swap;
        System.out.println("Unsorted values from array");

        for (int tmp : values)
            System.out.println(tmp);

        for (int c = 1; c < values.length; c++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] < values[j + 1]) {
                    swap = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted in Desending order from array");
        for (int k = 0; k < values.length; k++) {
            System.out.println(values[k]);
        }
    }
}
