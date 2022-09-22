class Solution {
public:
    int minSteps(string s, string t) {
        int count[26]={0},min=0;
        for(int i=0;i<s.length();i++){
            count[s[i]-'a']++;
        }
        for(int i=0;i<t.length();i++){
            count[t[i]-'a']--;
        }
        for(int i=0;i<26;i++){
            min+=abs(count[i]);
        }
        return min;
    }
};