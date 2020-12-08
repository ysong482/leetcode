class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1] != nums.length){
            return nums[nums.length-1]+1;
        }else if(nums[0] !=0){
            return 0;
        }else{
            for(int i=0; i< nums[nums.length-1] ; i++){
                if(nums[i]+1 != (nums[i+1])){
                    return nums[i]+1;
                }
            }
        }
        return -1;
    }
}
