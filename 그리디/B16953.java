import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B16953 {
    static long a,b;
    static int count;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ins = br.readLine().split(" ");
        long a = Long.parseLong(ins[0]);
        long b = Long.parseLong(ins[1]);
        count=1;
        bfs();
        System.out.println(count);
    }
    
    static void bfs(){
        while(a!=b){
            if(b%10==1){
                b=b/10;
            } else if(b%2==0){
                b=b/2;
            } else{
                System.out.println(-1);
                break;
            }
            count++;
        }
    }
}