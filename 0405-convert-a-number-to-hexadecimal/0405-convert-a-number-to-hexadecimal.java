class Solution {
    public String toHex(int num) {
        StringBuilder s = new StringBuilder();
        if(num==0)
        return "0";
        while(num!=0)
        {
            int rem = num & 15;
            if(rem<=9)
            {
                s.append((char)(rem+'0'));
            }
            else
            {
                s.append((char)(rem-10 +'a'));
            }
            num>>>= 4;
            
        }
        return s.reverse().toString();


        
    }
}