import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            long m = Long.parseLong(br.readLine());
            if(m<=2) {
            	sb.append(2).append("\n");
            	continue;
            }
            while(true) {
            	boolean flag = true;
            	for(int j=2;j<Math.sqrt(m)+1;j++) {
            		if(m%j==0) {
            			flag = false;
            			break;
            		}
            	}
            	if(flag) {
            		sb.append(m).append("\n");
            		break;
            	}
            	m++;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}