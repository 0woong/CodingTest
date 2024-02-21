import java.io.*;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int last = 0;
        StringBuilder sb = new StringBuilder();
        boolean err = false;
        for(int i=0;i<N;i++) {
			int n = Integer.parseInt(br.readLine());
            if(n>last){
                for(int j=last+1;j<=n;j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                last = n;
            }
            if(stack.peek()==n){
                stack.pop();
                sb.append("-\n");
            }
		}
        if(stack.size()>0){
            bw.write("NO\n");
        }
        else {
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }
}