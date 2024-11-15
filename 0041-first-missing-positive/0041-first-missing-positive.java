class Solution {
    public int firstMissingPositive(int[] nums) {
        int nums1[] = Arrays.stream(nums).filter(n ->  n > 0).toArray();
        Arrays.sort(nums1);
        int target = 1;
        for(int n : nums1)
        {
            if(n==target){
                target++;
            }
            else if(n > target){
                return target;
            }
        }
        return target;        
    }
}