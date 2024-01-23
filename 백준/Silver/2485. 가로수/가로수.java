import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        int gcd = 0;
        for(int i=0;i<n;i++){
            tree[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n-1;i++){
            int gap=tree[i+1]-tree[i];
            gcd = gcd(gap,gcd);
        }
        bw.write((tree[n-1]-tree[0])/gcd+1-(tree.length)+"");
        bw.flush();
        bw.close();
        br.close();
    }
    static int gcd(int a, int b){
        if(b==0){
            return a;
        } else{
            return gcd(b,a%b);
        }
    }
}