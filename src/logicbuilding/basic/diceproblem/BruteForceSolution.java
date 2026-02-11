package logicbuilding.basic.diceproblem;

public class BruteForceSolution {
    public static void main(String[] args)
    {
        int n = 2;
        System.out.println(oppositeFaceOfDice(n));
    }

    private static int oppositeFaceOfDice(int n) {
        switch (n){
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return -1;
        }
    }
}
