//使用hashset自动去重复，如果size不相等那么就有重复的数字。
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> number = new HashSet();
        for(int i=0 ; i < nums.length ; i++){
            number.add(nums[i]);
        }
        if(number.size() != nums.length){
            return true;
        }else{
            return false;
        }
    }
}
