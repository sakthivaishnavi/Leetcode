class Solution {
    public int[] decrypt(int[] code, int k) {
        int n =code.length;
        int sum=0;
        int arr[] = new int[n];
            if(k==0)
            {
                return new int[n];
            }
            if(k>0)
            {
                for(int i=1;i<=k;i++)
                {
                    sum += code[i%n];
                }
                for(int i=0;i<n;i++)
                {
                    arr[i]=sum;
                    sum -= code[(i+1)%n];
                    sum += code[(i+k+1) % n];
                }
            }
            else if(k<0)
            {
                for(int i=k;i<0;i++)
                {
                    sum+=code[(n+i)%n];
                }
                for(int i=0;i<n;i++)
                {
                    arr[i]=sum;
                    sum-= code[(n+i+k)%n];
                    sum+=code[i%n];
                }
                
            }
        

        return arr;
        
    }
}