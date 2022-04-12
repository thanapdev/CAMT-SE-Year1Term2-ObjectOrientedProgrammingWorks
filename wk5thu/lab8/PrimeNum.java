//642115022
//thanapong yamkamol

package lab8;

import java.util.Stack;

public class PrimeNum {

    Stack<Integer> stackInt = new Stack<>();
    private int integer;
    public PrimeNum(int num) {
        this.integer = num;
    }

    public void factor() {
        for (int i = 2; i * i <= integer; i++) {
            while (integer % i == 0) {
                stackInt.add(i);
                integer = integer / i;
            }
        }
        if (integer != 1)
            stackInt.add(integer);
        System.out.println(stackInt);
        System.out.println("Reversed Stack : ");
        System.out.println(reverse(stackInt));
    }

    public Stack reverse(Stack normal) {
        Stack<Integer> reverseStack = new Stack<>();
        for (int i = normal.size() - 1; i >= 0; i--) {
            reverseStack.push((int) normal.get(i));
        }
        return reverseStack;
    }
}
