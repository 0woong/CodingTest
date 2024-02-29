import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int last = 0;
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch(cmd){
                case "push":
                    int m = Integer.parseInt(st.nextToken());
                    q.offer(m);
                    last = m;
                    break;
                case "pop":
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(q.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()){
                        sb.append("1\n");
                    } else{
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(q.peek()).append("\n");
                    }
                    break;
                case "back":
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(last).append("\n");
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