import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s){
                case "push":
                    que.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(que.peek()==null){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(que.peek()).append("\n");
                        que.poll();
                    }
                    break;
                case "size":
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    if(que.isEmpty()){
                        sb.append(1).append("\n");
                    } else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(que.peek()==null){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(que.peek()).append("\n");
                    }
                    break;
                case "back":
                    if(que.peekLast()==null){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(que.peekLast()).append("\n");
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