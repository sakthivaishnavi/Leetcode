class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;
        StringBuilder s = new StringBuilder();
        while(i>=0 || j>=0)
        {
            int sum=carry;
            if(i>=0)
            {
                sum+=a.charAt(i)-'0';
            }
            if(j>=0)
            sum+=b.charAt(j)-'0';

            if(sum==0 || sum==1)
            {
                s.append(sum);
                carry=0;
            }
            else if(sum==2)
            {
                sum=0;
                s.append(sum);
                carry=1;
            }
            else
            {
                s.append("1");
                carry=1;
            }
            i--;
            j--;
        }
        if(carry==1)
        s.append("1");

        return s.reverse().toString();

        
    }
}