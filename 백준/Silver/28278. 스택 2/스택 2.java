import java.io.*;
import java.util.Stack;
public class Main {
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n --> 0){
            solution(br.readLine());
        }        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void solution(String s){
        char c = s.charAt(0);

        switch (c){
            case '1' : stack.push(Integer.parseInt(s.substring(2))); return;
            case '2' : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); return;
            case '3' : sb.append(stack.size()).append("\n"); return;
            case '4' : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); return;
            case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); return;
            default: break;
        }
    }
}