class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int ans = 0;
        for (int i = 0; i < tokens.length; i++){
            if (tokens[i].equals("+")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2+temp1);
                System.out.println("temp1: " + temp1 + ", temp2: " + temp2 + ", added: " +stack.peek());
            }
            else if (tokens[i].equals("-")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2-temp1);
                System.out.println("temp1: " + temp1 + ", temp2: " + temp2 + ", added: " +stack.peek());
            }
            else if (tokens[i].equals("*")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2*temp1);
                System.out.println("temp1: " + temp1 + ", temp2: " + temp2 + ", added: " +stack.peek());
            }
             else if (tokens[i].equals("/")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2/temp1);
                System.out.println("temp1: " + temp1 + ", temp2: " + temp2 + ", added: " +stack.peek());
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
                System.out.println("added to stack: " + stack.peek());
            }
        }
        return stack.pop();
    }
}
