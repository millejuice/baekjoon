package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B1181 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        // input만큼 단어를 받는 List를 만든다
        String[] words = new String[input];
        // nextLine으로 input만큼 단어를 입력한다
        for (int i = 0; i < input; i++) {
            words[i] = br.readLine();
        }
        // 1차 조건. 단어를 짧은것부터 앞에, 그러나 같은 글자면 사전적 순서로
        Arrays.sort(words,new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                if(s1.length()==s2.length()){
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        System.out.println(words[0]);
        for(int i =1; i<input;i++){
            if(!words[i].equals(words[i-1])){
                System.out.println(words[i]);
            }
        }

        br.close();
    }
}
