class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            while(i+1<s.length() && s.charAt(i+1)==s.charAt(i))
            {
                b = true;
                i++;
            }
            if(b){
                sb.append(s.charAt(i));
                b=false;
            }
        }
        return sb.toString();        
    }
}