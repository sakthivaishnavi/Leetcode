class Solution {
    public int minChanges(String s) {
        int count=0;
        for(int i=0;i<s.length();i+=2)
        {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            if(a!=b)
            count++;
        }
        return count;
        
    }
}