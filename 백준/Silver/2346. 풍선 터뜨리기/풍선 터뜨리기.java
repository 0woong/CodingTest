import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> dq = new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            dq.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
        }
        while(dq.size()>1) {
        	Balloon b = dq.poll();
        	int bv = b.value;
        	sb.append(b.index).append(" ");
        	if(bv>0) {
        		for(int i=0;i<bv-1;i++) {
        			Balloon tempb = dq.poll();
        			dq.offer(tempb);
        		}
        	} else if(bv<0) {
        		for(int i=0;i<Math.abs(bv);i++) {
        			Balloon tempb = dq.pollLast();
        			dq.offerFirst(tempb);
        		}
        	}
        }
        Balloon b = dq.poll();
        sb.append(b.index);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

class Balloon{
	int index;
	int value;
	public Balloon(int index, int value) {
		this.index=index;
		this.value=value;
	}
}