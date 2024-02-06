import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            switch(x){
                case 1:
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(deque.peek()==null){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(deque.poll()).append("\n");
                    }
                    break;
                case 4:
                    if(deque.peekLast()==null){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(deque.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if(deque.isEmpty()){
                        sb.append(1).append("\n");
                    } else{
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if(deque.peek()==null){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(deque.peek()).append("\n");
                    }
                    break;
                case 8:
                    if(deque.peekLast()==null){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
                default:
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}