import java.util.Stack;
public class prblm_6_ {
    public static boolean solve(String str){
        Stack<Character>s= new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            if(curr=='(' || curr=='{' || curr=='['){
                s.push(curr);
            }
            else{
                char temp = s.peek();
                if(s.isEmpty()){
                    return false;
                }
                if(temp=='(' && curr==')' || temp=='{' && curr=='}' || temp=='[' && curr==']'){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        String str = "((";
        System.out.println(solve(str));
    }   
}