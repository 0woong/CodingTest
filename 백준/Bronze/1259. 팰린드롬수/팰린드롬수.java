import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if(str.equals("0")) break;
            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();
            if(str.equals(reverse)){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
        }
    }
}