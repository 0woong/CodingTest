import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	if(n==0) break;
        	int cnt=0;
        	boolean[] arr = new boolean[(2*n)+1];
        	arr[0] = arr[1] = true;
        	for(int i=2;i*i<=n*2;i++) {
        		if(!arr[i]) {
        			for(int j=i*i;j<=n*2;j+=i) {
        				arr[j] = true;
        			}
        		}
        	}
        	
        	for(int i=n+1;i<=2*n;i++) {
        		if(!arr[i]) cnt++;
        	}
        	bw.write(cnt+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}