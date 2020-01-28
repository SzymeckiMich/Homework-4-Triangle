public class Right {
    boolean isRightTriangle(Triangle triangle) {
        return ((square(triangle.a) + square(triangle.b) == square(triangle.c)) ||
                (square(triangle.c) + square(triangle.b) == square(triangle.a)) ||
                (square(triangle.a) + square(triangle.c) == square(triangle.b))); //it can be done better
    }

    double square(double a) {
        return a * a;
    }

}
