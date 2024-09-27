import java.util.Map.Entry;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<mat.length;i++) {
            int co=0;
            for(int j=0;j<mat[i].length;j++) {
                if(mat[i][j]==1)
                co++;
            }  
        map.put(i,co);
        }
        
        List<Map.Entry<Integer, Integer>> entry = new ArrayList<>(map.entrySet());
        Collections.sort(entry, (a,b)->a.getValue().equals(b.getValue()) ? a.getValue()- b.getValue() : a.getValue()- b.getValue());

        int arr[]=new int[k];
       for(int i=0;i<k;i++){
            arr[i]=entry.get(i).getKey();
        }
       
        return arr;        
    }
}