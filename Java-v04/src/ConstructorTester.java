class Point{
    private double xCoordinate;
    private double yCoordinate;

    public Point() {}
    public Point(double x, double y){
        xCoordinate = x;
        yCoordinate = y;
    }

    @Override
    public String toString() {
        return "(" + Double.toString(xCoordinate) + ", " + Double.toString(yCoordinate) + ")";
    }
}

class Ball{
    private Point center;       //
    private double radius;
    private String color;
    public Ball() {}
    public Ball(double xValue, double yValue, double r){
        center = new Point(xValue, yValue);
        radius = r;
    }

    public Ball(double xValue, double yValue, double r, String c){
        this(xValue, yValue, r);
        color = c;
    }

    @Override
    public String toString(){
        return "A ball with center " + center.toString() + ", radius " + Double.toString(radius) + ", color "+ color;
    }
}

class MovingBall extends Ball {
    private double speed;
    public MovingBall() {}
    public MovingBall(double xValue, double yValue, double r, String c, double s){
        super(xValue, yValue, r, c);
        speed = s;
    }

    public String toString(){
        return super.toString() + ", speed " + Double.toString(speed);
    }
}

public class ConstructorTester{
    public static void main(String[] args) {
        MovingBall mb = new MovingBall(1.0, 2.0, 3.0, "blue", 3.3);
        System.out.println(mb.toString());

        // MovingBall(xVale, yValue, r, c, s) -> Ball(xVale, yValue, r, c) -> Ball(xVale, yValue, r) -> Point(x, y)
    }
}