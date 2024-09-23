class Solution {
    public int calculate(String s) {
        int num=0;
        char operator ='+';
        Stack<Integer> stack = new Stack<>();
        char cha[] = s.toCharArray();
        int i=0;
        for(char ch : cha)
        {
            if(Character.isDigit(ch)){
                num=num*10 + (ch-'0');
            }
            if(!Character.isDigit(ch) && ch!=' ' || i==s.length()-1)
            {
                if(operator=='/')
                stack.push(stack.pop()/num);
                else if(operator=='*')
                stack.push(stack.pop()*num);
                else if(operator=='+')
                stack.push(num);
                else
                stack.push(-num);

                operator=ch;
                num=0;
            }
            i++;
        }
        int ans=0;
        while(!stack.isEmpty())
        {
            ans+=stack.pop();
        }
        return ans;

        
    }
}