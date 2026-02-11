package logicbuilding.easy.overlappingrectangles;

public class OptimalSolution {
    public static void main(String[] args) {
        //r1 = [x1, y1, x2, y2]
        //r2 = [x1, y1, x2, y2]
        int[] r1 = {0, 0, 2, 2};
        int[] r2 = {1, 1, 3, 3};
        boolean result = isOverlap(r1, r2);
        System.out.println("Do the rectangles overlap? " + result);
    }

    public static boolean isOverlap(int[] r1, int[] r2) {
        return (r1[0] < r2[2] && // r1's left edge is to the left of r2's right edge)
                r1[2] > r2[0] && // r1's right edge is to the right of r2's left edge
                r1[1] < r2[3] && // r1's top edge is above r2's bottom edge
                r1[3] > r2[1]);   // r1's bottom edge is below r2's top edge
    }
}
//TC: O(1) - The algorithm performs a constant number of operations to determine if the rectangles overlap.
//SC: O(1) - The algorithm uses a constant amount of space to store the coordinates of the rectangles and the overlap dimensions.