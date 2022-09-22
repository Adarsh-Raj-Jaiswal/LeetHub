class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        int min = 0,i;
        for(i=0;i<s.length();i++)count[s.charAt(i)-'a']++;
        for(i=0;i<t.length();i++)count[t.charAt(i)-'a']--;
        for(i=0;i<26;i++)min += Math.abs(count[i]);
        return min;
    }
}