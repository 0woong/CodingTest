import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int want = Integer.parseInt(br.readLine());
        int result = 0;
        for(int j=0;j<arr.length;j++){
            if(want == arr[j]){
                result++;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}