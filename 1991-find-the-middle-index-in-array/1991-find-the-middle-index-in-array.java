class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
    for (int i=0; i<nums.length; i++) totalSum += nums[i];
    for (int i=0; i<nums.length; leftSum+=nums[i++])
        if (leftSum*2 == totalSum-nums[i]) return i;
    return -1;
    }
	// int leftSum = 0;
	// Map<Integer, Integer> map = new HashMap<>();
	// for (int i=0; i<nums.length; leftSum+=nums[i++])
	// 	map.putIfAbsent(leftSum*2+nums[i], i);
	// return map.getOrDefault(leftSum, -1);
}