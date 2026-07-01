class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean toReturn = true;
        if (s.length() % 2 != 0) return false;
        for (int i = 0; i< s.length(); i++){
            if ("({[".contains(s.charAt(i)+"")){
                stack.push(s.charAt(i));
            }
            else if (")}]".contains(s.charAt(i)+"") ){
                if (!stack.isEmpty()){
                char temp = stack.pop();

                if ((s.charAt(i) == ')') && temp == '('){
                    continue;
                }
                else if ((s.charAt(i) == ']') && temp == '['){
                    continue;
                }
                else if ((s.charAt(i) == '}') && temp == '{'){
                    continue;
                }
                }
                
                    toReturn = false;
                    break;
                

            }
        } 

        if (!stack.isEmpty()){
            System.out.println("Final Stack is not empty");
            toReturn = false;
        }
        return toReturn;
    }
}
