class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int x,y,sum;
        // int arr[]=new int[2];
        // x=0;
        // y=nums.length-1;
        // Arrays.sort(nums);
        // while(x<y){
        //     sum=nums[x]+nums[y];
        //     if(sum==target){
        //        arr[0]=x;
        //        arr[1]=y;
        //     }
        //     if(sum>target)y--;
        //     else x++;
        // }
        // return arr;
        int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            return result;
        }
        map.put(nums[i], i);
    }
    return result;
    }
}