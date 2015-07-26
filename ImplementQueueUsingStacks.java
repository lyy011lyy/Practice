/*20150725 Implement queue using stacks
 *
 *
 * */



class MyQueue {
    private Stack myStack;
    MyQueue(){
        myStack = new Stack();
    }
    
    // Push element x to the back of queue.
    public void push(int x) {
        myStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack tmp = new Stack();
        while(!myStack.empty()){
            tmp.push((Integer)myStack.pop());
        }
        tmp.pop();
        while(!tmp.empty()){
            myStack.push((Integer) tmp.pop());
        }
    }

    // Get the front element.
    public int peek() {
        Stack tmp = new Stack();
        while(!myStack.empty()){
            tmp.push((Integer)myStack.pop());
        }
        int x = (Integer) tmp.peek();
        while(!tmp.empty()){
            myStack.push((Integer)tmp.pop());
        }
        return x;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return myStack.empty();
    }
}
