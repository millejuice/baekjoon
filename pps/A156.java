package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput=br.readLine().split(" ");
        int n = Integer.parseInt(firstInput[0]);
        int m = Integer.parseInt(firstInput[1]);
        int[] trees=new int[n];
        String[] hOfTrees=br.readLine().split(" ");
        for(int i = 0;i<n;i++){
            trees[i]=Integer.parseInt(hOfTrees[i]);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(hOfTrees[i]);
            max = Math.max(max, trees[i]);
        }
        int end = max;
        int start = 0;
        int result=0;
        while(start<=end){
            long total=0;
            int cut=(start+end)/2;
            for(int i = 0; i<n;i++){
                if(trees[i]>cut){
                    total+=trees[i]-cut;
                }
            }
            if(total>=m){
                result=cut;
                start=cut+1;
            } else if(total<m){
                end=cut-1;
            }
        }
        System.out.println(result);
    }
}
