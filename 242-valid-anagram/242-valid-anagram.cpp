class Solution {
public:
    bool isAnagram(string s, string t) {
        int count[26]={0},n=s.length(),i;
        if(n!=t.length())return false;
        for(i=0;i<n;i++){
            count[s[i]-'a']++;
            count[t[i]-'a']--;
        }
        for(i=0;i<26;i++)if(count[i])return false;
        return true;
    }
    // public boolean isAnagram(String s, String t) {
    //     int[] alphabet = new int[26];
    //     for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
    //     for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
    //     for (int i : alphabet) if (i != 0) return false;
    //     return true;
    // }
};