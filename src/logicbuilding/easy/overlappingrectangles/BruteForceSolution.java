package logicbuilding.easy.overlappingrectangles;

public class BruteForceSolution {
    public static void main(String[] args) {
        //r1 = [x1, y1, x2, y2]
        //r2 = [x1, y1, x2, y2]
        int[] r1 = {0, 0, 2, 2};
        int[] r2 = {1, 1, 3, 3};
        boolean result = isOverlap(r1, r2);
        System.out.println("Do the rectangles overlap? " + result);
    }

    public static boolean isOverlap(int[] r1, int[] r2) {
        // Calculate the coordinates of the intersection rectangle
        int left = Math.max(r1[0], r2[0]);
        // The right edge of the intersection rectangle is the minimum of the right edges of the two rectangles
        int right = Math.min(r1[2], r2[2]);
        // The top edge of the intersection rectangle is the maximum of the top edges of the two rectangles
        int top = Math.max(r1[1], r2[1]);
        // The bottom edge of the intersection rectangle is the minimum of the bottom edges of the two rectangles
        int bottom = Math.min(r1[3], r2[3]);

        //compute overalap width and height
        int overlapWidth = right - left;
        int overlapHeight = bottom - top;
        // If both overlap width and height are positive, then the rectangles overlap
        return overlapWidth > 0 && overlapHeight > 0;
    }
}
//TC: O(1) - The algorithm performs a constant number of operations to determine if the rectangles overlap.
//SC: O(1) - The algorithm uses a constant amount of space to store the coordinates of the intersection rectangle and the overlap dimensions.