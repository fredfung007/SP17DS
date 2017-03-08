/**
 * Created by fredf on 3/7/2017.
 */
public class PascalTriangle {
    private static void print(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }

    }

    public static void main(String[] args) {
        PascalTriangle.print(6);
    }
}
