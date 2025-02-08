package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B10815 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        Map<String,String> sg = new HashMap<>();
        st=new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            sg.put(st.nextToken(), null);
        }
        int m = Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i = 0;i<m;i++){
            if(sg.containsKey(st.nextToken())){
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}
