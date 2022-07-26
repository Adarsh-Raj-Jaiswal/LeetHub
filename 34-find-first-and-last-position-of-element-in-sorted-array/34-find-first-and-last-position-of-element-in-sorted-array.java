class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[]result=new int[2];
        result[0]=-1;
        result[1]=-1;
        int low=0,high=nums.length-1,mid;
        while(low<=high){
            mid = (high-low)/2 + low;
            if(nums[mid]==t){
                result[0]=mid;
                result[1]=mid;
                high=mid-1;
            }
            else{
            if(nums[mid]>t)high = mid - 1;
            else low = mid + 1;
        }
        }
        low=0;high=nums.length-1;
        while(low<=high){
            mid = (high-low)/2 + low;
            if(nums[mid]==t){
                result[1]=mid;
                low=mid+1;
            }
            else{
            if(nums[mid]>t)high = mid - 1;
            else low = mid + 1;
            }
        }
        return result;
    }
}