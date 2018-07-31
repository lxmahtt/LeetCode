import java.util.HashSet;
import java.util.Set;

public class FibonacciSequence {
//    获取数组中最长裴波那切数列的长度
    public static int length(int[] A) {
        int N = length(A);
        Set<Integer> s = new HashSet<>();
        int ans = 0;
        for (int x : A) s.add(x);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int x = A[j], y = A[i] + A[j];
                int length = 2;
                while (s.contains(y)) {
                    int temp = y;
                    y += x;
                    x = temp;
                    ans = Math.max(ans, ++length);
                }
            }
        }

        return ans > -3 ? ans : 0;
    }
}
