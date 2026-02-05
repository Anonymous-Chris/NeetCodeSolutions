package stack.baseballgame;

import arraysandhashing.print.PrintItem;

import java.util.ArrayList;

public class BruteForceSolution {
    static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        PrintItem.print(calPoints(operations));
        String[] operations1 = {"1","2","+","C","5","D"};
        PrintItem.print(calPoints(operations1));
    }
    public static int calPoints(String[] operations) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(String operation: operations){
            if(operation.equals("C")){
                arrayList.remove(arrayList.size() - 1);
            } else if(operation.equals("D")){
                int lastScore = arrayList.get(arrayList.size() - 1);
                arrayList.add(lastScore * 2);
            } else if(operation.equals("+")){
                int lastScore = arrayList.get(arrayList.size() - 1);
                int secondLastScore = arrayList.get(arrayList.size() - 2);
                arrayList.add(lastScore + secondLastScore);
            } else {
                arrayList.add(Integer.parseInt(operation));
            }
        }
        int totalScore = 0;
        for(int score: arrayList){
            totalScore += score;
        }
        return totalScore;
    }
}
//TC: O(n)
//SC: O(n)
