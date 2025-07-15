package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A85 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];

        for(int i = 0;i<n;i++){
            s[i]=br.readLine();
        }
        Arrays.sort(s, (a,b)->{
            if(a.length()!=b.length()){
                return a.length() - b.length();
            }
            int sumA=getDigitSum(a);
            int sumB=getDigitSum(b);
            if(sumA!=sumB){
                return sumA-sumB;
            } 
            return a.compareTo(b);
        });

        for(int i = 0; i<n;i++){
            System.out.println(s[i]);
        }
    }

    public static int getDigitSum(String s){
        int sum = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                sum+=c-'0';
            }
        }
        return sum;
    }
}
