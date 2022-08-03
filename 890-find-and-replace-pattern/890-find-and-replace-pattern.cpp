class Solution {
public:
    vector<string> findAndReplacePattern(vector<string>& words, string pattern) {
        vector<string>result;
        for(int i=0;i<words.size();i++){
            
            if(findPattern(words[i])==findPattern(pattern)){
                
                result.push_back(words[i]);
            }
        }
        return result;
    }
    string findPattern(string s){
        unordered_map<char,int> map;
        for(int i=0;i<s.length();i++){
            if(!map.count(s[i])){
                map[s[i]] = map.size();
            }
        }
        for(int i=0;i<s.length();i++){
            s[i] = 'a' + map[s[i]];
        }
        return s;
    }
};