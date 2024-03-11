import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[1000001];
        isPrime[0] = true;
		isPrime[1] = true;
		for(int i=2;i<(int)Math.sqrt(1000000);i++) {
			for(int j=2;i*j<1000001;j++) {
				isPrime[i*j] = true;
			}
		}
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            boolean flag = false;
            for(int i=2;i<=n/2;i++){
            	if (!isPrime[i] && !isPrime[n - i]) {
					System.out.println(n + " = " + i + " + " + (n - i));
					flag = true;
					break;
				}
            }
            if(!flag){
            	System.out.println("Goldbach's conjecture is wrong.");;
            }
        }
        br.close();
    }
}