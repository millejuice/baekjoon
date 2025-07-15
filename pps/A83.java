package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class A83 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().trim().split(" ");
        HashMap<Integer,Integer> map = new HashMap<>();

        for(String s : tokens){
            int num = Integer.parseInt(s);
            map.put(num, map.getOrDefault(num, 0));
        }
        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);
        for(int num:list){
            System.out.print(num+" ");
        }
        
    }
}
