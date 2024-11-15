class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for(int i = 1; i <= n; i *= 10) {
            int div = i * 10;
            count += (n / div) * i + Math.min(Math.max(n % div - i + 1, 0), i);
        }
        return count;
    }
}