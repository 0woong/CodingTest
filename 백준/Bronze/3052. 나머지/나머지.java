import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[42];
        for(int i=0;i<10;i++){
            int n = Integer.parseInt(br.readLine());
            int ans = n%42;
            arr[ans] = 1;
        }
        int count = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}