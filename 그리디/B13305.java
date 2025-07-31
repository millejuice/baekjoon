import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13305 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n];
        int[] dist=new int[n];
        String[] distIn = br.readLine().split(" ");
        for(int i=0;i<n-1;i++){
            dist[i]=Integer.parseInt(distIn[i]);
        }
        dist[n-1]=0;
        String[] priceIn = br.readLine().split(" ");
        for(int i=0;i<n-1;i++){
            prices[i]=Integer.parseInt(priceIn[i]);
        }
        int cost=0;
        for(int i = 1;i<n;i++){
            if(prices[i]>prices[i-1]){
                prices[i]=prices[i-1];
            }
        }
        for(int i=0;i<n;i++){
            cost+=dist[i]*prices[i];
        }
        System.out.println(cost);
    }
}
