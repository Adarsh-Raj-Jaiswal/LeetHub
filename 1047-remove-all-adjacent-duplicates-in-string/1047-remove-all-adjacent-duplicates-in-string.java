class Solution {
    public String removeDuplicates(String s) {
        String res="";
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(!stack.empty()&&stack.peek()==s.charAt(i))stack.pop();
            else stack.push(s.charAt(i));
        }
        while(!stack.empty()){
            res+=stack.pop();
        }
        return res;
    }
}