import java.util.Stack;
public class prblm_7_ {
    public static boolean solve(String str){
        Stack<Character>s = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)==')'){
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<=1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(str.charAt(i));
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "(b+(c)-d)";
        System.out.println(solve(str));
    }
}
