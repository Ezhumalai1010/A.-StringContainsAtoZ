import java.util.*;

public class fpal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = 1;

        while (tc-- > 0) {

            String s = sc.next();
            int flag = 0;

            for (char ch : s.toCharArray()) {
                flag ^= (1 << (ch - 'a'));
            }

            if (flag == 0 || (flag & (flag - 1)) == 0)
                System.out.println("yes");
            else
                System.out.println("no");
        }

        sc.close();
    }
}