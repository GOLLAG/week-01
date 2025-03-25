public class P10 {
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public static void main(String[] args) {
        double x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;
        System.out.println("Collinear (Slope Method): " + areCollinearUsingSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear (Area Method): " + areCollinearUsingArea(x1, y1, x2, y2, x3, y3));
    }
}
