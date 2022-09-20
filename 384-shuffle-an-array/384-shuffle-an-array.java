class Solution {
    
    private int[] nums;
    private int[]res;
    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int n=nums.length;
        res=nums.clone();
        for(int i=0;i<n;i++){
            swap(res,i,(int)(Math.random()*10)%n);
        }
        return res;
    }
    public static void swap(int arr[],int i,int j){
        int k;
        k=arr[i];
        arr[i]=arr[j];
        arr[j]=k;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */