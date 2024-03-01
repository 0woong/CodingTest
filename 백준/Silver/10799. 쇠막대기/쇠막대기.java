import java.io.*;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        String s = br.readLine();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                continue;
            }
            if (s.charAt(i) == ')') {
                stack.pop();
                if (s.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
        
    }
}