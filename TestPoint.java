public class TestPoint {
    public static void main(String[] args){
        Point point1 = new Point();
        Point point2 = new Point(3,4);
        Point point3 = new Point(-5,7);
        Point point4 = new Point(3,-10);
        Point point5 = new Point(3,10);
        Point point6 = new Point(6,8);

        System.out.println(point2.manhattanDistance(point3));
        System.out.println(point3.manhattanDistance(point4));

        System.out.println(point2.isCollinear(point4, point5));
        System.out.println(point2.isCollinear(point3, point4));
        System.out.println(point1.isCollinear(point2, point6));
        System.out.println(point1.isCollinear(point2, point3));
    }
}
