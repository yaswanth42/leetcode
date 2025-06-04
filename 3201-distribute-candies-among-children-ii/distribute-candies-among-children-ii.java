class Solution {
    public long distributeCandies(int n, int limit) {
        long res = 0;
        for (int i = 0; i <= 3; i++) {
            int sign = (i % 2 == 0) ? 1 : -1;
            long count = 0;
            for (int mask = 0; mask < (1 << 3); mask++) {
                if (Integer.bitCount(mask) != i) continue;
                int sum = n;
                for (int j = 0; j < 3; j++) {
                    if (((mask >> j) & 1) == 1) {
                        sum -= (limit + 1);
                    }
                }
                if (sum >= 0) {
                    count += comb(sum + 2, 2);
                }
            }
            res += sign * count;
        }
        return res;
    }

    private long comb(long n, long r) {
        if (r > n) return 0;
        if (r == 2) return n * (n - 1) / 2;
        if (r == 1) return n;
        if (r == 0 || n == r) return 1;
        return 0;
    }
}
