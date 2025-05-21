class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int left=1,right=0;
        for(int day:bloomDay){
            right=Math.max(right,day);
        }
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean canMake(int[] bloomDay,int m,int k,int day){
        int bo=0;
        int flowers=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                flowers++;
                if(flowers==k){
                    bo++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
        }
        return bo>=m;
    }
}