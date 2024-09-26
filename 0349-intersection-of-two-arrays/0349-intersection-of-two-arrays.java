class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1= new HashSet<>();
        Set<Integer> s2= new HashSet<>();
        for(int n : nums1)
        {
            s1.add(n);
        }
        for(int n : nums2)
        {
            if(s1.contains(n))
            {
                s2.add(n);
            }
        }
        int arr[] = new int[s2.size()];
        int i=0; 
         for(int s : s2)
         {
            arr[i++]=s;
         }
         return arr;
        // return s2.toArray(new Integer[0]); - doesnot wrk for primitive int
        
    }
}