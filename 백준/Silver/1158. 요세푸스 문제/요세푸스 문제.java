import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=N;i++){
            q.offer(i);
        }
        Queue<Integer> result = new LinkedList<>();
        while(!q.isEmpty()){
            for(int i=0;i<K-1;i++){
                q.offer(q.poll());
            }
            result.offer(q.poll());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(result.size()>0){
        	int num = result.poll();
        	if(result.peek()!=null) {
        		sb.append(num).append(", ");
        	} else {
        		sb.append(num);
        	}
        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}