class Solution {
public:
    int minSteps(string s, string t) {
        int count[26]={0},res=0;
        for(int i=0;i<s.length();i++){
            count[s[i]-'a']++;
            count[t[i]-'a']--;
        }
        for(int i=0;i<26;i++){
            res+=abs(count[i]);
        }
        return res/2;
    }
};