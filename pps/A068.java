package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.LinkedList;

public class A068 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Deque<Integer> deque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; i++){
            String s=br.readLine();
            if(s.contains("push")){
                int input = Integer.parseInt(s.split(" ")[1]);
                deque.offerLast(input);
            } else if(s.contains("pop")){
                sb.append(deque.isEmpty()?"-1":deque.removeFirst()).append("\n");
            } else if(s.contains("front")){
                sb.append(deque.isEmpty()?"-1":deque.getFirst()).append("\n");
            } else if(s.contains("back")){
                sb.append(deque.isEmpty()?"-1":deque.getLast()).append("\n");
            } else if(s.contains("empty")){
                sb.append(deque.isEmpty()?"1":"0").append("\n");
            } else {
                sb.append(deque.size()).append("\n");
            }
        }
       System.out.println(sb);
    }
}
