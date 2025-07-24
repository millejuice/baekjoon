package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words[] = br.readLine().split(" ");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[1]);
        int c =Integer.parseInt(words[2]);
    }
}
