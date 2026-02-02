package stack_implementations;
import java.util.ArrayList;

class List_Based {
    ArrayList<Integer> stack;

    List_Based() {
        stack = new ArrayList<>();
    }

    boolean push(int val) {
        stack.add(val);
        return true;
    }

    int pop() {
        if (isEmpty()) return -1;
        return stack.remove(stack.size() - 1);
    }

    int peek() {
        if (isEmpty()) return -1;
        return stack.get(stack.size() - 1);
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    int size() {
        return stack.size();
    }
}
