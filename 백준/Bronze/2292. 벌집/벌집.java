import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        if(n==1){
            bw.write(n+"");
        } else{
            while(range<=n){
                range = 6*count+range;
                count++;
            }
            bw.write(count+"");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}