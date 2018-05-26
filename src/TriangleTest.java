public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7.5,6,4.5);
        TriangleIsRight triangleIsRight = new TriangleIsRight();
        boolean isRight = triangleIsRight.isRightTriangle(triangle);
        System.out.println("Czy trójkąt jest prostokątny? " + isRight);
    }
}
