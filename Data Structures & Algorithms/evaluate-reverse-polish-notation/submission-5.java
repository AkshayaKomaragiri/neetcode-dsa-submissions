class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < tokens.length; i++){
            if (tokens[i].equals("+")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2+temp1);
            }
            else if (tokens[i].equals("-")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2-temp1);
            }
            else if (tokens[i].equals("*")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2*temp1);
            }
             else if (tokens[i].equals("/")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2/temp1);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
