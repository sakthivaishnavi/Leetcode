class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int st=1;
        int en=(position[n-1]-position[0])/(m-1);
       
        while(st<=en){
            int mid = (st+en)/2;
            if(canPlace(position,mid,m)){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        return en;  
    }
    boolean canPlace(int position[], int mid,int m){
        int c=1;
        int last = position[0];

        for(int i=1;i<position.length;i++){
            if(position[i]-last>=mid){
                c++;
                last=position[i];
            }
            if(c==m)
            return true;
        }
        return false;
    }
}