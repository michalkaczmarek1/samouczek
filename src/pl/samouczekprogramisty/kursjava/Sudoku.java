package pl.samouczekprogramisty.kursjava;

public class Sudoku {

    public static void main(String[] args) {

        int[][] sudoku = new int[9][9];

        int zero = 0;
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;

        sudoku[0][0] = two;
        sudoku[0][3] = six;
        sudoku[0][5] = seven;
        sudoku[0][6] = five;

        sudoku[1][7] = nine;
        sudoku[1][8] = six;

        sudoku[2][0] = six;
        sudoku[2][2] = seven;
        sudoku[2][5] = one;
        sudoku[2][6] = three;

        sudoku[3][1] = five;
        sudoku[3][3] = seven;
        sudoku[3][4] = three;
        sudoku[3][5] = two;

        sudoku[4][1] = seven;
        sudoku[4][7] = two;

        sudoku[5][3] = one;
        sudoku[5][4] = eight;
        sudoku[5][5] = nine;
        sudoku[5][7] = seven;

        sudoku[6][2] = three;
        sudoku[6][3] = five;
        sudoku[6][6] = six;
        sudoku[6][8] = four;

        sudoku[7][0] = eight;
        sudoku[7][1] = four;

        sudoku[8][2] = five;
        sudoku[8][3] = two;
        sudoku[8][5] = six;
        sudoku[8][8] = eight;


    }
}
