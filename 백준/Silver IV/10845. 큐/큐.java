import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int last = 0;
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s){
                case "push":
                    int m = Integer.parseInt(st.nextToken());
                    last = m;
                    que.offer(m);
                    break;
                case "pop":
                    if(que.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(que.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    if(que.isEmpty()){
                        sb.append("1\n");
                    } else{
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if(que.isEmpty()){
                        sb.append("-1\n");
                    } else{
                        sb.append(que.peek()).append("\n");
                    }
                    break;
                case "back":
                    if(que.isEmpty()){
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