package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A155 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstInput[]=br.readLine().split(" ");
        int k=Integer.parseInt(firstInput[0]);
        int n = Integer.parseInt(firstInput[1]);
        int lan[]=new int[k];
        // 기준->길이
        for(int i=0;i<k;i++){
            lan[i]=Integer.parseInt(br.readLine());
        }
        long start=1;
        long end=0;
        long result=0; //최대 랜선의 길이 
        for(int i=0;i<k;i++){
            end=Math.max(end, lan[i]);
        }
        while(start<=end){
            long total=0;
            long cut=(start+end)/2;
            for(int i=0;i<k;i++){
                total+=lan[i]/cut;
            }
            if(total>=n){
                start=cut+1;
                result=cut;
            } else {
                end = cut-1;
            }
        }
        System.out.println(result);
    }
}
