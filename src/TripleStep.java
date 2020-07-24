/* A child is running up a staircase with n steps and can hop either 1 step, 2
steps, or 3 steps at a time. This program counts how many possible ways the
child can run up the staircase.

From pg. 134 of the book. (8.1)
 */

public class TripleStep {

    public static void main (String[] args) {

        System.out.println(waysToAscend(3));
        System.out.println(waysToAscend(5));
        System.out.println(waysToAscend(10));
        System.out.println(waysToAscend(0));

        /// This one should throw an exception
        System.out.println(waysToAscend(-1));

    }

    public static int waysToAscend(int steps) {

        if (steps >= 3) {
            return waysToAscend(steps - 1) +
                    waysToAscend(steps - 2) +
                    waysToAscend(steps - 3);
        } else if (steps == 2) {
            return 3;
        } else if (steps == 1) {
            return 1;
        } else if (steps == 0) {
            return 0;
        } else {
            throw new NullPointerException();
        }

    }

}
