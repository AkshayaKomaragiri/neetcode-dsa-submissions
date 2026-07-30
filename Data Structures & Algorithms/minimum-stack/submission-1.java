class MinStack {
    int min;
    LinkedList<Integer> list;
    LinkedList<Integer> extra;
    public MinStack() {
        list = new LinkedList<>();
        extra = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (extra.peek() != null) {
             System.out.println("val is " + val + ", extra top is " + extra.peek());
            if (val <= extra.peek()) {
                extra.addFirst(val);
                System.out.println("added " + val);
            } else {
                extra.addFirst(extra.peek());
            }
        }else extra.add(val);
       list.addFirst(val);
    }

    public void pop() {
        list.removeFirst();
        if (extra.peek() != null) extra.removeFirst();
    }

    public int top() {
        return list.peek();
    }

    public int getMin() {
        return extra.peek();
    }
}
