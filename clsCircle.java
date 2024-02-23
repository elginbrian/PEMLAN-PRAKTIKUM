package classCircle;
import java.util.*;
public class clsCircle {
    //attributes
    public int radius;
    private double pi = Math.PI;
    private double area;
    private double perimeter;

    //methods
    public double getArea(){
        area = Math.pow(radius, 2) * pi;
        return area;
    }

    public double getPerimeter(){
        perimeter = 2 * radius * pi;
        return perimeter;
    }
}
