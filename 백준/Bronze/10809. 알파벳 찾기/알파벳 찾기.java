import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split("");
        int[] arr = new int[26];

        for(int k=0;k<arr.length;k++){
        	arr[k] = -1;
            for(int j=str.length-1;j>=0;j--){
                int n = (int)str[j].charAt(0)-97;
                if(k == n){
                    arr[k] = j;
                }
            }
            sb.append(arr[k]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}