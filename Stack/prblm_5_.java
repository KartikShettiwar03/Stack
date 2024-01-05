import java.util.Stack;
public class prblm_5_ {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int ans[] = new int[arr.length];
        Stack<Integer>s = new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            int curr = arr[i];
            while(!s.isEmpty() && curr>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0 ; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
