/**
 * Created by fredf on 2/14/2017.
 */
public class gcd {
    public static int gcd(int a, int b) {
        if (b==0)
            return a;
        else
            return gcd(b, a % b);
    }
}
