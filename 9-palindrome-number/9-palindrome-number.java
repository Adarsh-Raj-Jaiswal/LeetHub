class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int num=x,reverse=0;
        while(num!=0){
            reverse=(reverse*10)+(num%10);
            num=num/10;
        }
        if(reverse==x)return true;
        else return false;
    }
}