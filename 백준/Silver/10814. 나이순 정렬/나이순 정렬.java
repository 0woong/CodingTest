import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder[] sb = new StringBuilder[201];
        for(int i=0;i<sb.length;i++) {
        	sb[i] = new StringBuilder();
        }
        
        
        for(int i=0;i<n;i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int age = Integer.parseInt(st.nextToken());
        	String name =  st.nextToken();
        	sb[age].append(age).append(" ").append(name).append("\n");
        }
        
        StringBuilder sb2 = new StringBuilder();
        for(StringBuilder val:sb) {
        	sb2.append(val);
        }
        bw.write(sb2.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}