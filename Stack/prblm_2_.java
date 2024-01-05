import java.util.Stack;

public class prblm_2_ {
    public static String solve(String str){
        Stack<Character>s = new Stack<>();
        int i=0;
        while(i != str.length()){
            s.push(str.charAt(i));
            i++;
        }
        String ans = "";
        i = 0;
        while(i!=str.length()){
            char ch = s.pop();
            ans += ch;
            i++;
        }
        return ans;
    }
    public static void main(String args[]){
        String str = "one";
        String ans = solve(str);
        System.out.println(ans);
    }
}
