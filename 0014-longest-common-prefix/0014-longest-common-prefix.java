class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder s = new StringBuilder();
       Arrays.sort(strs);
       String frst = strs[0];
       String last = strs[strs.length-1];
       for(int i=0;i<Math.min(frst.length(),last.length());i++)
       {
            if(frst.charAt(i)!=last.charAt(i))
                return s.toString();
            
            s.append(frst.charAt(i));
       }
       return s.toString();
        
    }
}