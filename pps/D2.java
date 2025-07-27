package pps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int h = Integer.parseInt(st.nextToken()); // 층 수
            int w = Integer.parseInt(st.nextToken()); // 호 수 (무시됨)
            int n = Integer.parseInt(st.nextToken()); // 몇 번째 손님인지

            int floor = n % h;
            int room = n / h;

            if (floor == 0) {
                floor = h;
            } else {
                room += 1;
            }

            System.out.println(floor * 100 + room);
        }
    }
}

