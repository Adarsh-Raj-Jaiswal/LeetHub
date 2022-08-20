class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // int maxSum=nums[0],currSum=0;
        // for(int i=0;i<nums.size();i++){
        //     if(nums[i]<=currSum+nums[i])
        //         currSum+=nums[i];
        //     else
        //         currSum=nums[i];
        //     if(maxSum<currSum)
        //         maxSum=currSum;
        // }
        // return maxSum;
    int localMax=nums[0],globalMax=nums[0];
    for(int i=1;i<nums.size();i++){
        localMax=max(nums[i],localMax+nums[i]);
        globalMax=max(localMax,globalMax);
    }
    return globalMax;
    }
};