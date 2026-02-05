package stack.baseballgame;

import print.PrintItem;

import java.util.Stack;

public class StackSolution {
    static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        PrintItem.print(calPoints(operations));
        String[] operations1 = {"1","2","+","C","5","D"};
        PrintItem.print(calPoints(operations1));
    }
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String operation: operations){
            if(operation.equals("C")){
                stack.pop();
            } else if(operation.equals("D")){
                int lastScore = stack.peek();
                stack.push(lastScore * 2);
            } else if(operation.equals("+")){
                //need to pop as cannot access second top element directly
                int lastScore = stack.pop();
                int secondLastScore = stack.peek();
                stack.push(lastScore);
                stack.push(lastScore + secondLastScore);
            } else {
                //as it is string need to parse to integer
                stack.push(Integer.parseInt(operation));
            }
        }
        int totalScore = 0;
        for(int score: stack){
            totalScore += score;
        }
        return totalScore;
    }
}
//TC: O(n)
//SC: O(n)