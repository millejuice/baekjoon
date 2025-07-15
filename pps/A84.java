package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = new String[input.length()];

        for(int i=0;i<input.length();i++){
            inputs[i]=input.substring(0+i, input.length());
        }
        Arrays.sort(inputs);
        for(String s : inputs){
            System.out.println(s);
        }
    }
}
