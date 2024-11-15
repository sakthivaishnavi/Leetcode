class Solution {
    private List<String> ans = new ArrayList<>();

    public List<String> addOperators(String num, int target) {
        if (num == null || num.length() == 0) return ans;
        dfs(0, "", 0, 0, num, target);
        return ans;
    }

    private void dfs(int index, String path, long resSoFar, long prevNum, String num, int target) {
        if (index == num.length()) {
            if (resSoFar == target) ans.add(path);
            return;
        }
        
        for (int j = index; j < num.length(); j++) {
            if (j > index && num.charAt(index) == '0') break; // Skip leading zero number--index not j
            long currNum = Long.parseLong(num.substring(index, j + 1));
            
            if (index == 0) { // index not j
                // First num, pick it without adding any operator

                // j not index
                dfs(j + 1, path + currNum, currNum, currNum, num, target);
            } else {
                dfs(j + 1, path + "+" + currNum, resSoFar + currNum, currNum, num, target);
                dfs(j + 1, path + "-" + currNum, resSoFar - currNum, -currNum, num, target);
                dfs(j + 1, path + "*" + currNum, resSoFar - prevNum + prevNum * currNum, prevNum * currNum, num, target);
            }
        }
    }
}