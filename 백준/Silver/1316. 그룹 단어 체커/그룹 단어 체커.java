import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = n;
        for(int i=0;i<n;i++){
            String s = br.readLine();
            boolean[] b = new boolean[26];
            int before = 0;
            for(int j=0;j<s.length();j++){
                int now = s.charAt(j);
                if(now != before){
                    if(b[now-'a'] == false){
                        b[now-'a'] = true;
                        before = now;
                    } else{
                        count--;
                        break;
                    }
                } else{
                    continue;
                }
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}