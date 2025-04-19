class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(original)){
            original=original*2;
        }
        return original;
    }
}