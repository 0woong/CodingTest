import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        int[] cnt = new int[1000001];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            cnt[arr[i]]++;
        }
        for(int i=0;i<N;i++){
            while(!stack.isEmpty() && cnt[arr[stack.peek()]]<cnt[arr[i]]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.empty()){
            arr[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(arr[i]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}