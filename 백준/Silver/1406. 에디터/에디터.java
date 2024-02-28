import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int N=0;N<s.length();N++){
            char c = s.charAt(N);
            stack1.push(c);
        }
        int M = Integer.parseInt(br.readLine());
        while(M-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "L":
                    if (stack1.isEmpty()) continue;
                    stack2.push(stack1.pop());
                    break;
                case "D":
                    if (stack2.isEmpty()) continue;
                    stack1.push(stack2.pop());
                    break;
                case "B":
                    if (stack1.isEmpty()) continue;
                    stack1.pop();
                    break;
                case "P":
                    stack1.push(st.nextToken().charAt(0));
                    break;
            }
        }
        while(!stack1.isEmpty()) {
        	stack2.push(stack1.pop());
        }
        while(!stack2.isEmpty()) {
        	bw.write(stack2.pop());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}