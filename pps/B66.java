package pps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B66 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        Integer[] arr = new Integer[n.length()];

        for(int i = 0; i<n.length();i++){
            arr[i]=n.charAt(i)-'0';
        }
        Arrays.sort(arr,(a,b)->b-a);
        for(int num:arr){
            System.out.print(num);
        }
    }
}
