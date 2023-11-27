import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = s.length();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='c' && i<n-1){
                if(s.charAt(i+1)=='=' || s.charAt(i+1)=='-'){
                    i++;
                }
            } else if(s.charAt(i)=='d' && i<n-1){
                if(s.charAt(i+1)=='z' && i<n-2){
                    if(s.charAt(i+2)=='='){
                        i+=2;
                    }
                } else if(s.charAt(i+1)=='-') {
                    i++;
                }
            } else if((s.charAt(i)=='l' || s.charAt(i)=='n') && i<n-1){
                if(s.charAt(i+1)=='j'){
                    i++;
                }
            } else if((s.charAt(i)=='s' || s.charAt(i)=='z') && i<n-1){
                if(s.charAt(i+1)=='='){
                    i++;
                }
            }
            count++;
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}