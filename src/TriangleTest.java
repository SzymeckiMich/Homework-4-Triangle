public class TriangleTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(-3,-100,5);


        if(triangle.isThisTriangle(triangle)){
            if(triangle.isRightTriangle(triangle)){
                System.out.println("It is a right triangle");
            }
            else{
                System.out.println("It isn't a right triangle");
            }
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
}