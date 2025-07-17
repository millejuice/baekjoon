import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Pair {
        int score;
        int index;

        Pair(int score, int index) {
            this.score = score;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int score = Integer.parseInt(br.readLine());
            list.add(new Pair(score, i + 1)); // 1-based index
        }

        // 점수 기준 내림차순 정렬
        list.sort((a, b) -> b.score - a.score);

        int sum = 0;
        List<Integer> selectedIndexes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sum += list.get(i).score;
            selectedIndexes.add(list.get(i).index);
        }

        // 인덱스 기준 오름차순 정렬
        Collections.sort(selectedIndexes);

        System.out.println(sum);
        for (int idx : selectedIndexes) {
            System.out.print(idx + " ");
        }
    }
}
