package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class A069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        Deque<Integer> deque = new LinkedList<>();
        List<Integer> answer = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=n;i++){
            deque.offerLast(i);
        }
        while(!deque.isEmpty()){
            for(int i = 0;i<k-1;i++){
                deque.addLast(deque.pollFirst());
            }
            answer.add(deque.pollFirst());
        }
        sb.append("<");
        for(int i = 0;i<n-1;i++){
            sb.append(answer.get(i)).append(", ");
        }
        sb.append(answer.get(n-1)).append(">");
        System.out.println(sb);
    }
}
