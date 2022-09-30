import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] numarray = new int[3];
        
        for(int i=0;i<3;i++){
            numarray[i] = sc.nextInt();
        }
        
        Arrays.sort(numarray);
        
        if(numarray[0]==numarray[2]){
            System.out.println(10000 + numarray[0] * 1000);
        } else if(numarray[0]==numarray[1]){
            System.out.println(1000 + numarray[0] * 100);
        } else if(numarray[1]==numarray[2]){
            System.out.println(1000 + numarray[1] * 100);
        } else{
            System.out.println(numarray[2] * 100);
        }
    }
}