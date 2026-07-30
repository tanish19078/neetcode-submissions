class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean rise=true;
        boolean fall=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                rise=false;
            }
            else if(nums[i]<nums[i+1]){
                fall=false;
            }
        }
return (rise||fall);
    }
}