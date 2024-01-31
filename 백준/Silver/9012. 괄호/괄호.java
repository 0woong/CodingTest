import java.io.*;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            sb.append(result(br.readLine())).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    public static String result(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            } else if(stack.empty()){
                return "NO";
            } else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        } else{
            return "NO";
        }
    }
}