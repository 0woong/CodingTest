import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] narr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            boolean flag = true;
            int check = Integer.parseInt(st.nextToken());
            for(int j=0;j<n;j++){
                if(check==narr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("0\n");
            } else{
                bw.write("1\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}