import java.util.*;

public class SortedStack {

    public static void main (String[] args) {

        Integer[] intArr1 = {7,1,2,4,8,13,-1};
        Stack<Integer> testStack1 = new Stack<>();
        for(Integer i : intArr1){
            testStack1.push(i);
        }
        System.out.println("Final result: " + sortStack(testStack1));

    }

    public static Stack sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int tempValue = stack.pop();

            while ((!tempStack.isEmpty()) && (tempStack.peek() > tempValue)) {
                stack.push(tempStack.pop());
            }

            tempStack.push(tempValue);
        }
        return tempStack;
    }

}
