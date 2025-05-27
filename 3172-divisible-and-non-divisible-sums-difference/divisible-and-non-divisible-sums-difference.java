class Solution {
    public int differenceOfSums(int n, int m) {
        int S=n*(n+1)/2;
        int k = n /m;
        int temp = m*k*(k+1)/2;
        return S-2*temp;
    }
}
