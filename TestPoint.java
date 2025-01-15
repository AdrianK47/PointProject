public class TestPoint {
    public static void main(String[] args){
        Point point1 = new Point();
        Point point2 = new Point(3,4);
        Point point3 = new Point(-5,7);
        Point point4 = new Point(3,-10);
        Point point5 = new Point(3,10);
        Point point6 = new Point(6,8);

        System.out.println("The points: ");
        System.out.println("    " + "p1: " + "x=" + point1.getX() + ",y=" + point1.getY());
        System.out.println("    " + "p2: " + "x=" + point2.getX() + ",y=" + point2.getY());
        System.out.println("    " + "p3: " + "x=" + point3.getX() + ",y=" + point3.getY());
        System.out.println("    " + "p4: " + "x=" + point4.getX() + ",y=" + point4.getY());
        System.out.println("    " + "p5: " + "x=" + point5.getX() + ",y=" + point5.getY());
        System.out.println("    " + "p6: " + "x=" + point6.getX() + ",y=" + point6.getY());

        System.out.println("Testing manhattanDistance: ");
        System.out.println("    p2 to p3: " + point2.manhattanDistance(point3));
        System.out.println("    p3 to p4: " + point3.manhattanDistance(point4));

        System.out.println("Testing isCollinear: ");
        System.out.println("    p2, p4, p5: "+ point2.isCollinear(point4, point5));
        System.out.println("    p2, p3, p4: "+ point2.isCollinear(point3, point4));
        System.out.println("    p1, p2, p6: "+ point1.isCollinear(point2, point6));
        System.out.println("    p1, p2, p3: "+ point1.isCollinear(point2, point3));
    }
}
