/**
 * Created by fred on 1/25/2017.
 */
public class Circle {
    int radius;
    public Circle(int r) {
        radius = r;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int r) {
        radius = r;
    }
    public static void main(String a[]) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(17);
        c1 = c2;
        System.out.printf("The radius of circle c1 is: %d\n",
                c1.getRadius() );
        System.out.printf("The radius of circle c2 is: %d\n",
                c2.getRadius() );
        c1.setRadius(25);
        System.out.printf("The radius of circle c1 is: %d\n",
                c1.getRadius() );
        System.out.printf("The radius of circle c2 is: %s\n",
                c2.getRadius() );
    }
}