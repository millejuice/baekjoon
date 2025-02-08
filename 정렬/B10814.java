package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B10814 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String[][] inputs = new String[input][2];

        for(int i = 0; i < input; i++){
            String temp[] = br.readLine().split(" ");
            inputs[i][0] = temp[0];
            inputs[i][1] = temp[1];
        }

            Arrays.sort(inputs,new Comparator<String[]>() {
                @Override
                public int compare(String[] s1,String[] s2){
                    return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }});

        for(int i = 0;i<input;i++){
            System.out.println(inputs[i][0]+" "+inputs[i][1]);
        }
    }
}
