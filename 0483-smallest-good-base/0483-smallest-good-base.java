class Solution {
    public String smallestGoodBase(String n) {
        long tn = Long.parseLong(n);
        long x = 1;
        
        for (int i = 62; i >= 1; i--) {
            if ((x << i) < tn) {
                long cur = mySolve(tn, i);
                if (cur != 0) {
                    return Long.toString(cur);
                }
            }
        }
        
        return Long.toString(tn - 1);
    }
    
    private long mySolve(long n, int d) {
        double tn = (double) n;
        long right = (long) (Math.pow(tn, 1.0 / d) + 1);
        long left = 1;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = 1, cur = 1;
            
            for (int i = 1; i <= d; i++) {
                cur *= mid;
                sum += cur;
            }
            
            if (sum == n) {
                return mid;
            }
            
            if (sum > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return 0;
    }
}