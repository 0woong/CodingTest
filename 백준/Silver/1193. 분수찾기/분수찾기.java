import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cross = 1, sum = 0;
        while(true) {
        	if(n<=cross+sum) {
        		if(cross % 2 != 0) {
        			bw.write((cross - (n - sum -1))+"/"+(n-sum));
        			break;
        		} else {
        			bw.write((n-sum)+"/"+(cross - (n - sum -1)));
        			break;
        		}
        	} else {
        		sum += cross;
        		cross++;
        	}
        }
        bw.flush();
        bw.close();
        br.close();
    }
}