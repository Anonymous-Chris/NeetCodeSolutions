package logicbuilding.basic.closestnumber;

public class BruteForceSolution {
    public static void main(String[] args) {
        int n = 13, m = 4;
        System.out.println(closestNumber(n, m));
        int n1 = -15, m1 = 6;
        System.out.println(closestNumber(n1, m1));
    }

    public static int closestNumber(int n, int m){
        int quotient = n / m;
        int closest = quotient * m;
        int nextClosest = (m*n) > 0 ? (quotient + 1) * m : (quotient - 1) * m;
        if(Math.abs(n - closest) < Math.abs(n - nextClosest)){
            return closest;
        } else {
            return nextClosest;
        }
    }
}
