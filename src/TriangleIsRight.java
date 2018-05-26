public class TriangleIsRight {
    public boolean isRightTriangle(Triangle triangle){
        double max=0;
        double min1=0;
        double min2=0;

        if (triangle.getBok1()>triangle.getBok2() && triangle.getBok1()>triangle.getBok3()) {
            max = triangle.getBok1();
            min1 = triangle.getBok2();
            min2 = triangle.getBok3();
        }
        else if (triangle.getBok2()>triangle.getBok1() && triangle.getBok2()>triangle.getBok3()){
            max = triangle.getBok2();
            min1 = triangle.getBok1();
            min2 = triangle.getBok3();
        }
        else if (triangle.getBok3()>triangle.getBok2() && triangle.getBok3()>triangle.getBok1()){
            max = triangle.getBok3();
            min1 = triangle.getBok2();
            min2 = triangle.getBok1();
        }

        return max*max == min1*min1 + min2*min2;
    }
}
