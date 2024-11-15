class Solution {
    public int calculate(String s) {
        Stack<Integer>st=new Stack<>();
int n=s.length();
int num=0;
int ans=0;
int sign=1;
for (int i=0;i<n;i++){
    char ch=s.charAt(i);
    if(Character.isDigit(ch)){
        num=10*num+(ch-'0');
    }
    else if(ch=='+'){
        ans=ans+(num*sign);
        sign=1;
        num=0;
    }
    else if(ch=='-'){
        ans=ans+(num*sign);
        sign=-1;
        num=0;
    }
    else if(ch=='('){
        st.push(ans);
        st.push(sign);
        ans=0;
        sign=1;
    }
    else if(ch==')'){
        ans=ans+(num*sign);
        num=0;
        ans=ans*(st.pop());
        ans+=st.pop();
    }
}
ans=ans+(num*sign);
return ans;
    }
}