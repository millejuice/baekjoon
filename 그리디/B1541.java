
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1514 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list=new ArrayList<>();
        String[] parts = br.readLine().split("-");
        int answer=0;
        answer+=addition(parts[0]);
        for(int i=1;i<parts.length;i++){
            answer-=addition(parts[i]);
        }
        System.out.println(answer);
    }
    static int addition(String line){
        String[] nums = line.split("\\+");  
        int sum=0;
        for(String num:nums){
            sum+=Integer.parseInt(num);
        }
        return sum;
    }
}
