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

    boolean isRightTriangle(Triangle triangle) {
        return ((square(triangle.a) + square(triangle.b) == square(triangle.c)) ||
                (square(triangle.c) + square(triangle.b) == square(triangle.a)) ||
                (square(triangle.a) + square(triangle.c) == square(triangle.b))); //it can be done better
    }

    double square(double a) {
        return a * a;
    }
}
