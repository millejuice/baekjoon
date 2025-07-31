import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 회의 개수
        int[][] meetings = new int[n][2];        // 회의 정보 저장 [시작, 종료]
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            meetings[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }
        
        Arrays.sort(meetings,(a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });
        // 제일 앞에 있는 meeting은 필수
        int answer=1;
        int latest=meetings[0][1];
        for(int i = 1; i<n;i++){
            if(meetings[i][0]>latest){
                answer++;
                latest=meetings[i][1];
            }
        }
        System.out.println(answer);
    }
}
