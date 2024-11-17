public class Solution {
    public int countVowelPermutation(int n) {
        long prevA = 1, prevE = 1, prevI = 1, prevO = 1, prevU = 1;
        int mod = 1000000007; 
        for (int length = 2; length <= n; length++) {
            long nextA = (prevE + prevU + prevI) % mod; 
            long nextE = (prevA + prevI) % mod; 
            long nextI = (prevE + prevO) % mod; 
            long nextO = prevI;
            long nextU = (prevO + prevI) % mod; 

            prevA = nextA;
            prevE = nextE;
            prevI = nextI;
            prevO = nextO;
            prevU = nextU;
        }

        return (int) ((prevA + prevE + prevI + prevO + prevU) % mod);
    }
}