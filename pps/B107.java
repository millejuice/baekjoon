package pps;

import java.util.List;

public class B107 {
    public static long sum(List<Integer> a) {
        long ans = 0;
        for (int i = 0; i < a.size(); i++) {
            ans += a.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        // 예시: List.of()는 Java 9 이상에서 사용 가능
        List<Integer> a = List.of(1, 2, 3, 4, 5);
        System.out.println(sum(a));  // 출력: 15
    }
}
