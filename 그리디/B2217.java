import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B2217 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] ropes = new Integer[n];
        for(int i = 0;i<n;i++){
            ropes[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes,Comparator.reverseOrder());
        int total=0;
        for(int i=1;i<=n;i++){
            total=Math.max(total, i*ropes[i-1]);
        }
        System.out.println(total);
    }
}
