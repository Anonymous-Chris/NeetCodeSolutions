package logicbuilding.basic.nthtermofap;

public class FormulaSolution {
    public static void main(String[] args)
    {
        int a1 = 2, a2 = 3;
        int n = 4;
        System.out.println(nthTermOfAP(a1, a2, n));
    }

    private static int nthTermOfAP(int a1, int a2, int n) {
        int difference = a2 - a1;
        return a1 + (n - 1) * difference;
    }
}
