import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch(cmd){
                case "push_front":
                    dq.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(dq.pollFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(dq.pollLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty":
                    if(dq.isEmpty()){
                        sb.append("1\n");
                    } else{
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(dq.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(dq.peekLast()).append("\n");
                    }
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}