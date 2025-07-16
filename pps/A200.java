package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A200 {
    public static void main(String[] args) throws NumberFormatException, IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         String answer = n%2==0 ? "SK":"CY";
         System.out.println(answer);
    }
}
