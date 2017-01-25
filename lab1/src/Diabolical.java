/**
 * Created by fred on 1/25/2017.
 */
public class Diabolical {
    public static void f(A x) {
        A y = x;
        y.key = x.key + 1;
    }
    public static void f(B x) {
        B y = new B();
        y.key = x.key + 2;
    }
    public static void main(String[] args) {
        A p = new A( );
        p.key = 3;
        B q = new B( );
        q.key = 10;
        f(p);
        System.out.println(p.key);
        f(q);
        System.out.println(q.key);
        p = q;
        f(p);
        System.out.println(p.key);
    }
}
class A {
    public int key;
}
class B extends A {
}