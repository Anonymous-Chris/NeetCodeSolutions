package logicbuilding.easy.validtriangle;

public class BruteForceSolution {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        if (isValidTriangle(a, b, c)) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
        int x = 1, y = 2, z = 3;
        if (isValidTriangle(x, y, z)) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
}
