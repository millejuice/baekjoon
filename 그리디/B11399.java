
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B11399 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] p = new int[n];

        for(int i = 0;i<n;i++){
            p[i]=Integer.parseInt(temp[i]);
        }
        Arrays.sort(p);
        int total=0;
        for(int i=0;i<n;i++){
            total+=p[i];
            p[i]=total;
        }
        int answer=0;
        for(int i =0;i<n;i++){
            answer+=p[i];
        }
        System.out.println(answer);
    }
}
