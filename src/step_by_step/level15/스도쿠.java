package step_by_step.level15;

import java.util.*;

public class 스도쿠 {
    static String[][] arr = new String[9][9];

    static HashSet<String> rowSet = new HashSet<>();
    static HashSet<String> columnSet = new HashSet<>();
    static HashSet<String> groupSet = new HashSet<>();
    static HashSet<String> options = new HashSet<>() {};

    static String findValue(int row, int column) {
        for (int i = 0; i < 9; i++) {
            rowSet.add(arr[row][i]); //set이 문제 -> 비워야함
            columnSet.add(arr[i][column]);
            options.add(String.valueOf(i+1));
        }
        int group_row = row/3;
        int group_column = column/3;
        for (int i = group_row*3; i < group_row*3 + 3; i++) {
            for (int j = group_column*3; j < 3; j++) {
                groupSet.add(arr[i][j]);
            }
        }

        options.removeAll(rowSet);
        options.removeAll(columnSet);
        options.removeAll(groupSet);
        String[] values = options.toArray(new String[0]);
        Arrays.sort(values);

        return values[0];
    }

    static void fill_sudoku () {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j].equals("0")) {
                    arr[i][j] = findValue(i, j);
                    rowSet.clear();
                    columnSet.clear();
                    groupSet.clear();
                    options.clear();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            String input = sc.nextLine();
            arr[i] = input.split(" ");
        }

        fill_sudoku();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
