import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] linearr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            linearr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(check(linearr));
        bw.flush();
        bw.close();
        br.close();
    }
    public static String check(int[] line){
        Stack<Integer> stack = new Stack<>();
        int cnt = 1;
        boolean flag = true;
        for(int i=0;i<line.length;i++){
            if(line[i] != cnt){
                if(!stack.isEmpty() && stack.peek()==cnt){
                    stack.pop();
                    i--;
                    cnt++;
                } else{
                    stack.push(line[i]);
                }
            } else{
                cnt++;
            }
        }
        for(int i=0;i<stack.size();i++){
            int t = stack.pop();
            if(t==cnt){
                cnt++;
            } else{
                flag = false;
                break;
            }
        }
        return flag ? "Nice":"Sad";
    }
}