class Solution {
    public String makeFancyString(String s) {
        StringBuilder st = new StringBuilder();
        boolean flag =false;
        int n =s.length();
        for(int i=0;i<n;i++)
        {
            char l = s.charAt(i);
            st.append(l);
            while(i+1< n && s.charAt(i+1) == l)
            {
                flag =true;
                i++;
            }
            if(flag)
            {
                st.append(l);
                flag =false;
            }
           
        }
        return st.toString();
    }
}