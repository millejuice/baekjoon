import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B3273 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        String[] inputs = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());
        for(int i = 0; i<n;i++){
            seq[i]=Integer.parseInt(inputs[i]);
        }

        int right=n-1,left=0;
        int sum=0,answer=0;
        Arrays.sort(seq);

        while(left<right){
            sum=seq[right]+seq[left];
            if(sum==x){
                answer++;
                left++;
                right--;
            } else if(sum>x){
                right--;
            } else if(sum<x){
                left++;
            }
        }
        System.out.println(answer);
    }
}
