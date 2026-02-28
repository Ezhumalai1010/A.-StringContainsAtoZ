import java.util.*;
public class Main {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();

        for (int i = 1; i < (1 << n); i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
