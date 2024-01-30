import java.io.*;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
        	int n = Integer.parseInt(br.readLine());
            if(n!=0){
                stack.push(n);
            } else{
                stack.pop();
            }
        }
        int sum = 0;
        for(int num:stack){
            sum+=num;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}