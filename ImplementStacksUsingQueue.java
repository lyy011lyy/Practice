/*
 * 20150725
 * Implement stacks using queue
*/


class MyStack {
    private Queue<Integer> q;
    MyStack(){
         q = new LinkedList<Integer>(); 
    }
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> tmp = new LinkedList<Integer>();
        while(q.peek() != null){
            tmp.add(q.remove());
        }
        q.add(x);
        while(tmp.peek() != null){
            q.add(tmp.remove());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.remove();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.peek() == null ? true : false ;
    }
}
