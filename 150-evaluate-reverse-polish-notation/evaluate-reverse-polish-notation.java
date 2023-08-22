class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for(String s : tokens){
            if(isOperator(s)){
                int ele2 = Integer.parseInt(st.pop());
                int ele1 = Integer.parseInt(st.pop());
                int ans = 0;

                if(s.equals("*")){
                    ans = ele1 * ele2;
                }
                else if(s.equals("+")){
                    ans = ele1 + ele2;
                }
                else if(s.equals("-")){
                    ans = ele1 - ele2;
                }
                else if(s.equals("/")){
                    ans = ele1 / ele2;
                }

                st.push(ans + "");
            }else{
                st.push(s);
            }
        }

        return Integer.parseInt(st.peek());
    }

    private boolean isOperator(String op){
        if(op.equals("*") || op.equals("+") || op.equals("/") || op.equals("-")){
            return true;
        }
        return false;
    }
}