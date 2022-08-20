class Solution {
public:
    // bool containsDuplicate(vector<int>& nums) {
    //     set<int>val;
    //     for(int i=0;i<nums.size();i++){
    //         if(val.count(nums[i]))return true;
    //         val.insert(nums[i]);
    //     }
    //     return false;
    // }

    bool containsDuplicate(vector<int>& nums) {
        return nums.size() > set<int>(nums.begin(), nums.end()).size();        
    }
};