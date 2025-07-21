package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A211 {
    public static void main(String[] args) throws NumberFormatException, IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp=new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = arr[i];
        }
        int max=0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i], dp[j]+arr[i]);
                }
            }
            max=Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
