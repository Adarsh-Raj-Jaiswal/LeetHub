class Solution {
public:
    map<pair<int,int>,int>mp;
    int uniquePaths(int m, int n) {
        int one,two;
        if(n==1||m==1)return 1;
        if(mp.count({ n-1,m }) == 0){
            one = uniquePaths(n-1,m);
            mp.insert({ { n-1,m }, one });
        }
        else{
            one = mp[{ n-1,m }];
        }
        if(mp.count({ n,m-1 }) == 0){
            two = uniquePaths(n,m-1);
            mp.insert({ { n,m-1 }, two });
        }
        else{
            two = mp[{ n,m-1 }];
        }
        return one + two;
    }
};