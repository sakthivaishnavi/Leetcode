class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        int indexP[] = new int[200];
        HashMap<String, Integer> indexS = new HashMap<>();

        if(pattern.length()!=str.length)
        return false;

        for(int i=0;i<pattern.length();i++)
        {
            if(indexP[pattern.charAt(i)]!= indexS.getOrDefault(str[i],0))
            return false;

            indexP[pattern.charAt(i)]=i+1;
            indexS.put(str[i],i+1);
        }
        return true;        
    }
}