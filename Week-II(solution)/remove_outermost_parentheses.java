public class remove_outermost_parentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int cur=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(cur>0){
                    ans.append(ch);
                }
                cur++;
            }
            else{
                cur--;
                if(cur>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
    
}
