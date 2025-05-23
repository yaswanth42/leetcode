class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m*n;
        int mr=m,mc=n;
        for (int[] op : ops) {
            mr=Math.min(mr,op[0]);
            mc=Math.min(mc,op[1]);
        }
        return mr*mc;
    }
}
