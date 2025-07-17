package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class C37 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<BigInteger> fibo = new ArrayList<>();
        BigInteger max = new BigInteger("10").pow(100);


        fibo.add(BigInteger.ONE);
        fibo.add(BigInteger.TWO);

        while(true){
            BigInteger next = fibo.get(fibo.size()-1).add(fibo.get(fibo.size()-2));
            if (next.compareTo(max) > 0) break;
            fibo.add(next);
        }

        while(true){
            String line = br.readLine();
            if(line.equals("0 0")) break;

            String[] part=line.split(" ");
            BigInteger inputA = new BigInteger(part[0]);
            BigInteger inputB = new BigInteger(part[1]);

            // fibo안에 있는 a보다 크거나 같은 첫번째 index
            int low = lower(fibo, inputA);
            int high = higher(fibo, inputB);
            // fibo안에 있는 b보다 작거나 같은 마지막 index
            System.out.println(high-low+1);
        }

        
    }
    private static int lower(List<BigInteger> list,BigInteger target){
        int left = 0, right = list.size()-1;
        while(left<right){
            int mid = (left+right)/2;
            if(list.get(mid).compareTo(target)<0){
                left= mid+1;
            } else {
                right=mid;
            }
        }
        return left;
    }

    private static int higher(List<BigInteger> list,BigInteger target){
        int left = 0, right = list.size()-1;
        int ans=-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(list.get(mid).compareTo(target)<=0){
                ans=mid;
                left=mid+1;
            } else {
                right= mid-1;
            }
        }
        return ans;
    }

}
