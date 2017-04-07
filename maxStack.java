import java.util.Stack;

public class MaxStack {

    Stack<Integer> stack     = new Stack<Integer>();
    Stack<Integer> maxsStack = new Stack<Integer>();

    // Add a new item to the top of our stack. If the item is greater
    // than or equal to the last item in maxsStack, it's
    // the new max! So we'll add it to maxsStack.
    public int push(int item) {
        stack.push(item);
        if (maxsStack.empty() || item >= (int) maxsStack.peek()) {
            maxsStack.push(item);
        }
        return item;
    }

    // Remove and return the top item from our stack. If it equals
    // the top item in maxsStack, they must have been pushed in together.
    // So we'll pop it out of maxsStack too.
    public int pop() {
        int item = (int) stack.pop();
        if (item == (int) maxsStack.peek()) {
            maxsStack.pop();
        }
        return item;
    }

    // The last item in maxsStack is the max item in our stack.
    public int getMax() {
        return (int) maxsStack.peek();
    }
}