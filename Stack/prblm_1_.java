import java.util.Stack;

public class prblm_1_{
    public static void pushAtBtm(Stack<Integer> s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int temp = (int) s.peek();
        s.pop();
        pushAtBtm(s,val);
        s.push(temp);
    }
    public static void display(Stack<Integer> temp){
        while(!temp.isEmpty()){
            System.out.println(temp.peek());
            temp.pop();
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBtm(s,4);
        System.out.println();
        display(s);
    }
}