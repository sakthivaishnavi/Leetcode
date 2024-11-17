public class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == ',' || c == '(') continue; 
            if ( c == 't' ||c == 'f' || c == '!' || c == '&' || c == '|')
                st.push(c);
            else if (c == ')') {
                boolean hasTrue = false, hasFalse = false;
                while ( st.peek() != '!' && st.peek() != '&' && st.peek() != '|') {
                    char val = st.pop();
                    if (val == 't') hasTrue = true;
                    if (val == 'f') hasFalse = true;
                }
                char op = st.pop();
                if (op == '!')
                    st.push(hasTrue ? 'f' : 't');
                else if (op == '&')
                    st.push(hasFalse ? 'f' : 't');
                else
                    st.push(hasTrue ? 't' : 'f');
            }
        }
        return st.peek() == 't';
    }
}