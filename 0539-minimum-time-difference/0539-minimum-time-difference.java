
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            String time[]=timePoints.get(i).split(":");
            arr[i]=Integer.valueOf(time[0])*60+Integer.valueOf(time[1]);
        }
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min=Math.min(min,(arr[i+1]-arr[i]));
        }
        min=Math.min(min,(1440+arr[0]-arr[n-1]));
        return min;
    }
}


