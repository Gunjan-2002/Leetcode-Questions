class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(ch == ')'){
                    if(st.size() == 0){
                        return false;
                    }else if(st.peek() != '('){
                        return false;
                    }
                    st.pop();
                }else if(ch == '}'){
                     if(st.size() == 0){
                        return false;
                    }else if(st.peek() != '{'){
                        return false;
                    }
                    st.pop();
                }else if(ch == ']'){
                     if(st.size() == 0){
                        return false;
                    }else if(st.peek() != '['){
                        return false;
                    }
                    st.pop();
                }
            }
        }
        if(st.size() != 0){
            return false;
        }

        return true;
       
    }

    private char getReverse(char ch){
        if(ch == '{'){
            return '}';
        }else if(ch == '('){
            return ')';
        }
        return ']';
    }
}