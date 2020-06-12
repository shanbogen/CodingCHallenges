import java.util.Arrays;

public class SmallestDifference {
    public static void main (String[] args) {
        int[] testArray1 = {1,3,15,11,2};
        int[] testArray2 = {23,127,9,235,19,8};

        System.out.println("Final result: " + smallestDifference(testArray1, testArray2));

    }

    public static int smallestDifference(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0;
        int j = 0;
        int difference = Math.abs(array1[0] - array2[0]);

        System.out.println("Initial difference is " + difference);
        System.out.println("Array lengths are " + array1.length + " " + array2.length);

        while (i < (array1.length - 1) | j < (array2.length - 1)) {

            if (i == array1.length - 1) {
                if (Math.abs(array1[i] - array2[j+1]) < difference) {
                    difference = Math.abs(array1[i] - array2[j+1]);
                }
                j++;
            } else if (j == array2.length - 1) {
                if (Math.abs(array1[i+1] - array2[j]) < difference) {
                    difference = Math.abs(array1[i+1] - array2[j]);
                }
                i++;
            } else if (Math.abs(array1[i] - array2[j+1]) < Math.abs(array1[i+1] - array2[j])) {
                if (Math.abs(array1[i] - array2[j+1]) < difference) {
                    difference = Math.abs(array1[i] - array2[j+1]);
                }
                j++;
            } else if (Math.abs(array1[i+1] - array2[j]) < difference) {
                difference = Math.abs(array1[i+1] - array2[j]);
            } else {
                i++;
            }
        }

        return difference;

    }
}
