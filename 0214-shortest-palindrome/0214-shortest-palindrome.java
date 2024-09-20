class Solution {
    public String shortestPalindrome(String s) {

        int c = kmp(new StringBuilder(s).reverse().toString(), s);
        return new StringBuilder(s.substring(c)).reverse().toString() + s;
    }

        int kmp(String rev, String org)
        {
            String newstring = org + '#' + rev;
            int p[] = new int[newstring.length()];
            int i=1,k=0;
            while(i<newstring.length())
            {
                if(newstring.charAt(i) == newstring.charAt(k))
                {
                    k++;
                    p[i]=k;
                    i++;
                }
                else
                {
                    if(k>0)
                    {
                        k = p[k-1];
                    }
                    else
                    {
                       p[i]=0;
                       i++;
                    }
                }
            }
        

        return p[newstring.length() - 1];
        
    }
}