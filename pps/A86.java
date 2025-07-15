package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A86 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int range = m - n;
        String[] s = new String[range+1];
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = n; i<=m;i++){
            
        }
    }
}
