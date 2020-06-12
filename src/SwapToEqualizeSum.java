import java.util.Arrays;

public class SwapToEqualizeSum {

    public static void main(String[] args) {

        int[] array1 = {5,7,2};
        int[] array2 = {0,1,3};

        System.out.println(Arrays.toString(findSwappedValues(array1,array2)));
    }

    public static int[] findSwappedValues(int[] array1, int[] array2) {

        Arrays.sort(array1);
        Arrays.sort(array2);
        int sum1 = arraySum(array1);
        int sum2 = arraySum(array2);

        int[] noSolutionResult = new int[0];

        if ((sum1 - sum2) % 2 != 0) {
            System.out.println("Sum difference is uneven");
            return noSolutionResult;
        }

        int targetDif = (sum1 - sum2) / 2;
        System.out.println("Target difference: " + targetDif);
        int i = 0;
        int j = 0;

        while (i < array1.length & j < array2.length) {

            int curDif = array1[i] - array2[j];
            System.out.println("Current difference: " + curDif);
            System.out.println("Array1 value: " + array1[i]);
            System.out.println("Array2 value: " + array2[j]);

            if (curDif == targetDif) {

                int[] solution = {array1[i], array2[j]};
                System.out.println("Solution found");
                return solution;

            } else if (curDif < targetDif) {

                if (array1[i] <= array2[j]) {
                    j++;
                } else {
                    i++;
                }

            } else {

                if (array1[i] >= array2[j]) {
                    i++;
                } else {
                    j++;
                }

            }

        }

        System.out.println("Iterated and no solution found");

        return noSolutionResult;
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }

}
