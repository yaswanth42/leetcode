class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String numStr = String.valueOf(i);
            int len = numStr.length();
            if (len % 2 != 0) continue; 
            int half = len / 2;
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < half; j++) {
                sum1 += numStr.charAt(j) - '0';
                sum2 += numStr.charAt(j + half) - '0';
            }
            if (sum1 == sum2) {
                count++;
            }
        }
        return count;
    }
}
