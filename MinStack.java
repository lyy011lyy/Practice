class MinStack {
    private ArrayList<Integer> stackList = new ArrayList<Integer>();
    private int minimum = Integer.MAX_VALUE;
    
    
    public void push(int x) {
        if (x < minimum) minimum = x;
        stackList.add(x);
    }

    public void pop() {
        if (stackList.size() > 0){
            if (top() == minimum) {
                stackList.remove(stackList.size() - 1);
                minimum = top();
                for (int temp : stackList){
                    if (temp <= minimum) minimum = temp;
                }
                if (stackList.size() == 0) {
                    minimum = Integer.MAX_VALUE;
                }
            }else{
            stackList.remove(stackList.size() - 1);
            }
        }
    }

    public int top() {
        if (stackList.size() > 0) {
            return stackList.get(stackList.size() - 1);
        } else {
            return 0;
        }
    }

    public int getMin() {
        if (stackList.size() > 0) {
            return minimum;
        } else {
            return 0;
        }
    }
}

