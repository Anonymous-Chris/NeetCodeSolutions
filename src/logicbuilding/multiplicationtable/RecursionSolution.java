package logicbuilding.multiplicationtable;

public class RecursionSolution {
    static void main(String[] args) {
        int n = 5;
        int upto = 20;
        printTable(n, upto, 1);
    }

    public static void printTable(int num, int upto, int start){
        if(start>upto){
            return;
        }
        System.out.println(num + " x " + start + " = " + (num*start));
        printTable(num, upto, start+1);
    }
}
//TC: O(upto) - We make a recursive call for each number from 1 to upto to print the multiplication table.
//SC: O(upto) - The space complexity is O(upto) due to the recursive call stack. Each recursive call adds a new frame to the stack, and in the worst case, we will have upto frames in the stack until we reach the base case.