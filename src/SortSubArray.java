import java.util.Stack;

public class SortSubArray {

    //Given an array of integers, write a method to find indices m and n such that if you sorted elements m through n, the entire array would be sorted. Minimize n-m (that is, find the smallest such sequence)
    //EXAMPLE
    //Input: 1,2,4,7,10,11,7,12,6,7,16,18,19
    //output(3,9)'

    public static void main (String[] args) {

        int[] input = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        int[] output = getSortIndices(input);
        //System.out.println(output.toString());

    }

    public static int[] getSortIndices(int[] array) {

        //TODO: NOT SUCCESSFULLY IMPLEMENTED

        int i = 0;
        int j = array.length;
        int m = 0;
        int n = j-1;
        boolean outOfOrder = false;


        while(i < j) {
            if (array[i] >= array[j]) {
                
            }
        }




        int[] noSolution = new int[0];

        while (i < array.length) {
            if (array[i-1] > array[i] & outOfOrder) {
                n = i;
            } else if (array[i-1] > array[i]) {
                m = i-1;
                outOfOrder = true;
            } else {
                outOfOrder = false;
            }
            i++;
        }

        if (!outOfOrder) {
            System.out.println("No solution found");
            return noSolution;
        } else {
            int[] solution = {m,n};
            System.out.println("Solution: " + m + " " + n);
            return solution;
        }

    }

}
