class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int max1=0,max2=0;
        for(int i=0;i<seats.length;i++){
         max1= Math.max(max1,seats[i]);
         max2= Math.max(max2,students[i]);
        }

        int count1[] = new int[max1+1];
        int count2[] = new int[max2+1];

        for(int i=0;i<seats.length;i++){
            count1[seats[i]]++;
            count2[students[i]]++;
        }
        int n=0;
        for(int i=0;i<count1.length;i++){
            while(count1[i]>0){
                seats[n]=i;
                n++;
                count1[i]--;
            }
        }
        n=0;
        for(int i=0;i<count2.length;i++)
        {
            while(count2[i]>0){
                students[n]=i;
                n++;
                count2[i]--;
            }
        }
        n=0;
        int sum=0;
        while(n<seats.length){
            sum+=Math.abs(students[n]-seats[n]);
            n++;
        }
        return sum;        
    }
}