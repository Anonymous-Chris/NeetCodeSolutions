package logicbuilding.basic.multiplicationtable;

public class BruteForceSolution {
    static void main(String[] args) {
        int n = 5;
        int upto = 20;
        printTable(n, upto);
    }

    public static void printTable(int num, int upto){
        for(int i =1; i<=upto;i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
//TC: O(upto) - We iterate from 1 to upto to print the multiplication table.
//SC: O(1) - We are using a constant amount of space to store the current multiplication result.