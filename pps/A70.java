package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class A70 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            deque.offerLast(i);
        }
        while(deque.size()>1){
            deque.pollFirst();
            deque.offerLast(deque.pollFirst());
        }
        System.out.println(deque.pollFirst());
    }
}
