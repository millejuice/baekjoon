package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B18870 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int[] inputs = new int[input];
        int[] sorted = new int[input];
        HashMap<Integer,Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<input;i++){
            sorted[i]=inputs[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        int rank = 0;
        for(int j : sorted){
            if(!map.containsKey(j)){
                map.put(j, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j:inputs){
            int a = map.get(j);
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}
