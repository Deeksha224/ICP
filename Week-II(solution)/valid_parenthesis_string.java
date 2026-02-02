public class valid_parenthesis_string {
    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {
        int open = 0; // maximum open parentheses possible
        int close = 0; // minimum open parentheses possible
        for(char ch : s.toCharArray()){
            if (ch =='('){ // increment both for '('
                open++;
                close++;
            }
            if(ch ==')'){ // decrement both for ')'
                open--;
                close--;
            }
            if(ch=='*'){ // making two cases for '*'. treating one as '(', other as ')'
                open++;
                close--;
            }
            
            if(open < 0){ // if open goes negative, return false as there are more closing parentheses
                return false;
            }
            if(close < 0){ //if close goes negative, reset to 0 , as minimum open parentheses can't be negative
                close = 0;
            }
        }
        return close==0; // if minimum open parentheses is 0, return true
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
