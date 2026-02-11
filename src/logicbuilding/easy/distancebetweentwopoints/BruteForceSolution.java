package logicbuilding.easy.distancebetweentwopoints;

public class BruteForceSolution {
    public static void main(String[] args) {
        int x1 = 3, y1 = 4, x2 = 7, y2 = 7;
        double result = distance(x1, y1, x2, y2);
        System.out.println("Distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + result);
        int x3 = 3, y3 = 4, x4 = 4, y4 = 3;
        double result2 = distance(x3, y3, x4, y4);
        System.out.println("Distance between points (" + x3 + ", " + y3 + ") and (" + x4 + ", " + y4 + ") is: " + result2);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = 0;
        result = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        //result = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return result;
    }
}
