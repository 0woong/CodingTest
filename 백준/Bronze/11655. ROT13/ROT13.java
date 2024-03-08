import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='a' && c<='z'){
                c += 13;
                if (c>'z'){
                    int tmp = c - 'z';
                    c = 'a'-1;
                    c += tmp;
                }
            } else if (c>='A' && c<='Z'){
                c += 13;
                if (c>'Z'){
                    int tmp = c - 'Z';
                    c = 'A'-1;
                    c += tmp;
                }
            }
            sb.append(c);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}