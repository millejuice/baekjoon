package pps;

import java.util.*;

public class A86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        String[] nums = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        List<Pair> list = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            String word;
            if (i >= 10) {
                int tens = i / 10;
                int ones = i % 10;
                word = nums[tens] + " " + nums[ones];
            } else {
                word = nums[i];
            }
            list.add(new Pair(word, i));
        }

        // 사전순 정렬
        Collections.sort(list);

        // 출력 (10개씩 한 줄)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).value + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }

    // 비교 기준: 문자열 기준으로 정렬
    static class Pair implements Comparable<Pair> {
        String word;
        int value;

        Pair(String word, int value) {
            this.word = word;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return this.word.compareTo(o.word);
        }
    }
}

