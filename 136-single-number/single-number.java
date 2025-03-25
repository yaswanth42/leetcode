class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int x=nums[i];
        //     int cnt=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==x){
        //             cnt++;
        //         }
        //     }
        //     if(cnt==1){
        //         return x;
        //     }
        // }
        // return -1;
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}