import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = m - 1; i >= 0; i--) {
            int N = Integer.parseInt(st.nextToken());
            sum += N * Math.pow(A, i);
        }
        while (sum != 0) {
            stack.push(sum % B);
            sum /= B;
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}