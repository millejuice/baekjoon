
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1026 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        String[] temp=br.readLine().split(" ");
        for(int i = 0;i<n;i++){
            a[i]=Integer.parseInt(temp[i]);
        }
        String[] temp2=br.readLine().split(" ");
        for(int i = 0;i<n;i++){
            b[i]=Integer.parseInt(temp2[i]);
        }
        Arrays.sort(a);
        // b의 값들중 큰 값들의 index부터 내림차순으로 배열 저장
        Integer[] bIdx = new Integer[n];
        for(int i=0;i<n;i++) bIdx[i]=i;
        Arrays.sort(bIdx,(i,j)->b[j]-b[i]);
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=a[i]*b[bIdx[i]];
        }
        System.out.println(sum);
    }
}
