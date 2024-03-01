import java.io.*;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        boolean flag = true;
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c=='<'){
                flag = false;
                while(!stack.isEmpty()) {
                	sb.append(stack.pop());
                }
            } else if(c=='>'){
                flag = true;
            }
            if(!flag){
                sb.append(c);
            } else{
                if(c==' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(c);
                } else if(c=='>'){
                	sb.append(c);
                } else{
                    stack.push(c);
                }
            }
            if(i==S.length()-1){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}