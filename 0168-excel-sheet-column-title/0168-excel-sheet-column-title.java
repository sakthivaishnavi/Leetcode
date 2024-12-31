class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber>0)
        {
            columnNumber--;
            res.append((char)(columnNumber%26 + 'A'));
            columnNumber/=26;
        }
        return res.reverse().toString();        
    }
}