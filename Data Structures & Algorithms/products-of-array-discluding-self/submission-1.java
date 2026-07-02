class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return new int[0];
        final int length = nums.length;
        final int[] prefixSumArr = new int[length];
        final int[] suffixSumArr = new int[length];
        final int[] results = new int[length];
        prefixSumArr[0] = nums[0];
        suffixSumArr[length - 1] = nums[length - 1];
        for (int i = 1; i < nums.length; i++) {
            final int j = length - 1 - i;
            prefixSumArr[i] = nums[i] * prefixSumArr[i - 1];
            suffixSumArr[j] = nums[j] * suffixSumArr[j + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            results[i] = (i - 1 < 0 ? 1: prefixSumArr[i - 1]) * (i + 1 >= length ? 1: suffixSumArr[i + 1]);
        }
        return results;
    }
}  
