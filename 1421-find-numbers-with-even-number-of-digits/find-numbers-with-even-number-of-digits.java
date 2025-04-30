class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int num:nums){
            int d=String.valueOf(num).length();
            if(d%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}