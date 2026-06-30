class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        Set set = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return set.size() != nums.length;
    }
}