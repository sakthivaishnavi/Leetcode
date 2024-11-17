class Solution {
    public int minSwapsCouples(int[] row) {
        int c = 0;
        for (int i = 0; i < row.length - 2; i += 2) {
            int p;
            if (row[i] % 2 == 0)
                p = row[i] + 1;
            else
                p = row[i] - 1;
            int j = i + 1;
            while (row[j] != p)
                j++;
            if (j == i + 1)
                continue;
            int temp = row[i + 1];
            row[i + 1] = row[j];
            row[j] = temp;
            c++;
        }
        return c;
    }
}