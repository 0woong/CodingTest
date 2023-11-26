import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split("");
        int sum = 0;
        String g1 = "ABC";
        String g2 = "DEF";
        String g3 = "GHI";
        String g4 = "JKL";
        String g5 = "MNO";
        String g6 = "PQRS";
        String g7 = "TUV";
        String g8 = "WXYZ";
        for(int i=0;i<arr.length;i++){
            if(g1.contains(arr[i])){
                sum += 3;
            } else if(g2.contains(arr[i])){
                sum += 4;
            } else if(g3.contains(arr[i])){
                sum += 5;
            } else if(g4.contains(arr[i])){
                sum += 6;
            } else if(g5.contains(arr[i])){
                sum += 7;
            } else if(g6.contains(arr[i])){
                sum += 8;
            } else if(g7.contains(arr[i])){
                sum += 9;
            } else if(g8.contains(arr[i])){
                sum += 10;
            }
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}