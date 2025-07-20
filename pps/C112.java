package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C112 {
    static long dp[]= new long[101];
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<101;i++){
            dp[i]=-1;
        }

        dp[1]=1L;
        dp[2]=1L;
        dp[3]=1L;
        for(int i = 0; i<t;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(recur(n));
        }
    }
    private static long recur(int n){
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=recur(n-2)+recur(n-3);
        return dp[n];
    }
}
