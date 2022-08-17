package step_by_step.level15;

import java.util.*;

public class 스도쿠 {
    static String[][] board = new String[9][9];

    static HashSet<String> rowSet = new HashSet<>();
    static HashSet<String> columnSet = new HashSet<>();
    static HashSet<String> groupSet = new HashSet<>();
    static HashSet<String> options = new HashSet<>() {};

    static String findValue(int row, int column) {
        for (int i = 0; i < 9; i++) {
            rowSet.add(board[row][i]);
            columnSet.add(board[i][column]);
            options.add(String.valueOf(i+1));
        }
        int group_row = row/3;
        int group_column = column/3;
        for (int i = group_row*3; i < group_row*3 + 3; i++) {
            for (int j = group_column*3; j < 3; j++) {
                groupSet.add(board[i][j]);
            }
        }

        options.removeAll(rowSet);
        options.removeAll(columnSet);
        options.removeAll(groupSet);
        //비어 있다면 그전 배열로 돌아가서 다음 값으로 입력 후 진행
        String[] values = options.toArray(new String[0]);
        Arrays.sort(values);

        return values[0];
    }

    static void fill_sudoku (int depth) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j].equals("0")) {
                    board[i][j] = findValue(i, j);
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
            board[i] = input.split(" ");
        }

        fill_sudoku();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
