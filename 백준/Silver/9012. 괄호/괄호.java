import java.io.*;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c=='('){
                    stack.push(c);
                }else if(stack.isEmpty()){
                    flag = false;
                } else{
                    stack.pop();
                }
            }
            if(stack.isEmpty() && flag){
                sb.append("YES\n");
            } else{
                sb.append("NO\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}