class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int len=0;

        for(char c : s.toCharArray())
        {
            if(set.contains(c))
            {
                set.remove(c);
                len+=2;
            }
            else
            set.add(c);
        }
        if(!set.isEmpty())
        len+=1;

        return len;
    }
}