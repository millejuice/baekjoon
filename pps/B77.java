package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B77 {
    static BigInteger[] fib;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib = new BigInteger[Math.max(3, n + 1)];
        for(int i = 0;i<=n;i++){
            fib[i]=BigInteger.valueOf(-1);
        }
        fib[1]=BigInteger.valueOf(1);
        fib[2]=BigInteger.valueOf(1);
        System.out.println(fibo(n));
        
    }

    public static BigInteger fibo(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (fib[n].equals(BigInteger.valueOf(-1))) {
            fib[n] = fibo(n - 1).add(fibo(n - 2));
        }
        return fib[n];
    }
}
