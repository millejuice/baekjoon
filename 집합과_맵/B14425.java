package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B14425 {
    public static void main(String[] args) throws IOException {
        int n=0;
        int m=0;
        Set<String> s = new HashSet<>();
        int count = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 0; i<n; i++){
            s.add(br.readLine());
        }
        for(int i = 0; i<m;i++){
            String str = br.readLine();
            if(s.contains(str)){
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }
}
