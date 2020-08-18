/* Given a string, write a function to check if it is a permutation of a
palindrome. A palindrome is a word or phrase that is the same forwards and
backwards. A permutation is a rearrangement of letters. The palindrome does not
need to be limited to just dictionary words. You can ignore casing and non-
letter characters.

From pg. 91 of the book. (1.4)
 */

import java.util.Arrays;

public class PalindromePermutation {

    public static void main (String[] args) {

        //Actual palindrome, no repeated letter
        String test1 = "tacocat";

        //Rearranged version of test1
        String test2 = "cattaco";

        //Not a palindrome
        String test3 = "tacothecat";

        //Rearranged palindrome with repeated letter
        String test4 = "shancnnoaneocebnbrnorhonns";

        //Results should be true, true, false, true
        System.out.println(checkIfPalindromePermutation(test1));
        System.out.println(checkIfPalindromePermutation(test2));
        System.out.println(checkIfPalindromePermutation(test3));
        System.out.println(checkIfPalindromePermutation(test4));

    }

    public static boolean checkIfPalindromePermutation(String candidate) {

        //Methodology: (1) sort string
        //(2) iterate over string and return false if more than 1 uneven count
        //for any character
        //TODO: use a hashmap instead to avoid sorting, return on >1 collision?

        char[] candidateArray = candidate.toCharArray();
        Arrays.sort(candidateArray);

        int numOdd = 0;
        int curCount = 0;

        for (int i = 0; i < candidateArray.length; i++) {

            if (i == 0) {
                curCount = 1;
            } else if (candidateArray[i] == candidateArray[i-1]) {
                curCount ++;
            } else {
                if (curCount % 2 == 1) {
                    numOdd ++;
                }
                if (numOdd > 1) {
                    return false;
                }
                curCount = 1;

            }

        }

        return true;

    }

}
