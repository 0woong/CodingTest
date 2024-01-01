import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int j=0;j<n;j++){
            sb.append(arr[j]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}