import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            long m = Long.parseLong(br.readLine());
            while(true){
                if(sosu(m)){
                    bw.write(m+"\n");
                    break;
                }
                m++;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static boolean sosu(long a){
        if(a<2){
            return false;
        } else{
            for(long i=2;i<=(long)Math.sqrt(a);i++){
                if(a%i==0){
                	return false;
                }
            }
            return true;
        }
    }
}