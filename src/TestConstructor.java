/**
 * Created by ChangChang on 2019/1/6.
 */
class Point{
    double x,y;

    Point(double _x,double _y){
        x=_x;
        y=_y;
    }

    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        //Point p2=new Point();会报错，可以手动加一个
        System.out.println(p.getDistance(origin));
    }
}
