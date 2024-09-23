class Solution {
    public int addDigits(int num) {
       int rem=0;
        while(num/10!=0){
        int sum=0;
        while(num>0)
        {
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
            
        if(sum/10==0)
            return sum;
        else
            num=sum;
      }
        return num;
       
        
    }
    }
