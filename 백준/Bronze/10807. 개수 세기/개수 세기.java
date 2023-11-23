import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int want = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(want == arr[i]){
                result++;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}