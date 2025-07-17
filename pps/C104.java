package pps;

import java.util.*;

class C104 {
    static int[] fibo= new int[100001];
    public int solution(int n) {
        for(int i=0;i<fibo.length;i++){
            fibo[i]=-1;
        }
        fibo[0]=0;
        fibo[1]=1;
        
        return recur(n);
    }
    
    static int recur(int n){
        if(fibo[n]!=-1){
            return fibo[n];
        }
        fibo[n]=(recur(n-1)+recur(n-2))%1234567;
        return fibo[n];
    }
}
