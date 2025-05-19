class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0],b=nums[1],c=nums[2];
        if(a+b<=c){
            return "none";
        }
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.size()==1){
            return "equilateral";
        }
        if(set.size()==2){
            return "isosceles";
        }
        return "scalene";
    }
}