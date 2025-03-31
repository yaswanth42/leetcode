class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;
        int l=0,h=n-1;
        while(l<=h){
            int mid = l + (h - l) / 2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}