class Solution {
    private List<String> ans;
    private Boolean dp[][];
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        ans=new ArrayList<>();
        Set<String> set=new HashSet<>();
        for(String s: words) {
            set.add(s);
        }
        for(String s: words) {
            dp=new Boolean[s.length()][s.length()];
            if(util(set, s, 0, s.length()-1, 0, s.length()-1)) {
                ans.add(s);
            }
        }
        return ans;
    }

    private boolean util(Set<String> set, String word, int i, int j, int N, int M) {
        if(set.contains(word.substring(i, j+1)) && !(i==N && j==M)) return true;
        if(i>j) {
            return false;
        }

        if(dp[i][j]!=null) return dp[i][j]; 

        boolean ret=false;
        for(int itr=i; itr<=j; itr++) {
            boolean r=util(set, word, i, itr-1, N, M) && util(set, word, itr, j, N, M);
            if(r) {
                ret=true;
                break;
            }
        }

        return dp[i][j]=ret;
    }
}