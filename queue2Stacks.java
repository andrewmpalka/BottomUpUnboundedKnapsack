  class QueueTwoStacks {
    Stack<Integer> inStack = new Stack<Integer>();
    Stack<Integer> outStack = new Stack<Integer>();

    public void enqueue(int item) {
        inStack.push(item);
    }

    public Integer dequeue() {
        if (outStack.size() == 0) {
            // Move items from in_stack to out_stack, reversing order
            while (inStack.size() > 0) {
                int newestInStackItem = inStack.pop();
                outStack.push(newestInStackItem);
            }
            // If out_stack is still empty, raise an error
            if (outStack.size() == 0) {
                throw new NoSuchElementException("Can't dequeue from empty queue!");
            }
        }
        return outStack.pop();
    }
}