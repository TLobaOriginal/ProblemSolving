import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(',')');
        hm.put('{','}');
        hm.put('[',']');

        ArrayList<Character> unMatched = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){ //If it's an opening bracket
                stack.push(c);
            } else {                //If not then
                /*We must then check if stack is empty
                If not we then check if the top is corresponding to it
                We can then pop it if it's not*/
                if(!stack.isEmpty()){
                    if(hm.get(stack.peek()) == c){
                        stack.pop();
                    }
                    else{
                        unMatched.add(c);
                    }
                } else{
                    unMatched.add(c);
                }
            }
        }

        if(stack.isEmpty() && unMatched.isEmpty())
            return true;
        else if(stack.isEmpty() && !unMatched.isEmpty())
            return false;
        else if(!stack.isEmpty())
            return false;

        return false;
    }
}
