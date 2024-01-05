import java.util.Stack;

public class prblm_3_ {
    public static void pushAtBtm(Stack<Integer>s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int temp = s.pop();
        pushAtBtm(s,val);
        s.push(temp);
    }
    public static void reverseAStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverseAStack(s);
        pushAtBtm(s,temp);
    }
    public static void main(String args[]){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseAStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
