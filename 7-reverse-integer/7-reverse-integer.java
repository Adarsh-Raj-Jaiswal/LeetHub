class Solution{
    public int reverse(int x){
        int reverse;
        for(reverse=0;x!=0;reverse=(reverse*10)+(x%10),x=x/10)
            if(reverse>2147483647/10||reverse<-2147483648/10)return 0;
        return reverse;
    }
}