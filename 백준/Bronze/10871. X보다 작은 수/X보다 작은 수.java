import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st1.nextToken());
        int[] arr = new int[count];
        int target = Integer.parseInt(st1.nextToken());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
            if(arr[i]<target){
                sb.append(arr[i]).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}