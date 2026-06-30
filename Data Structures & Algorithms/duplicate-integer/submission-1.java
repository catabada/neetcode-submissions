class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        Map map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null)  map.put(nums[i], 0);
            else return true;
        }

        return false;
    }
}