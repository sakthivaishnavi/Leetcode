class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        Map indexS = new HashMap<>();

        if(pattern.length()!=str.length)
        return false;

        for(Integer i=0;i<pattern.length();++i)
        {
            if(indexS.put(pattern.charAt(i),i)!= indexS.put(str[i],i))
            return false;
        }
        return true;        
    }
}