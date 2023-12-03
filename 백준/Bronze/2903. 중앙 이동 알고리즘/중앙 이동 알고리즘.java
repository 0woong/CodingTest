import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int point = 2;
        int count = 1;
        for(int i=0;i<n;i++){
            point += count;
            count *= 2;
        }
        int result = point*point;
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}