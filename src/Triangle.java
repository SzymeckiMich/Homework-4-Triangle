public class Triangle {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isThisTriangle(Triangle triangle) {
        return ((triangle.a + triangle.b > triangle.c) && (triangle.a + triangle.c > triangle.b) && (triangle.b
                + triangle.c > triangle.a));
    }
}
