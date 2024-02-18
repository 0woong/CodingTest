import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        long max = 0;
        
        int[] arr = new int[K];
        for(int i=0;i<K;i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        	if(arr[i]>max) {
        		max = arr[i];
        	}
        }
        max++;
        long min = 0;
        long mid = 0;
        while(min<max) {
        	mid = (max+min) / 2;
        	
        	long cnt = 0;
        	for(int i=0;i<arr.length;i++) {
        		cnt += (arr[i]/mid);
        	}
        	if(cnt<N) {
        		max = mid;
        	} else {
        		min = mid+1;
        	}
        }
        bw.write(min-1+"");
        bw.flush();
        bw.close();
        br.close();
    }
}