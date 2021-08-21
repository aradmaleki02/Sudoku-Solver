package sudoku;

import java.util.ArrayList;

public class Sudoku {
    private Character[][] sudoku = new Character[9][9];
    private ArrayList<Character>[][] possibleNumbers = new ArrayList[9][9];

    public Character[][] getSudoku() {
        return sudoku;
    }

    public Sudoku(Character[][] sudoku) {
        copySudoku(sudoku, this.sudoku);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                possibleNumbers[i][j] = new ArrayList<>();
                for (int k = 1; k <= 9; k++) {
                    possibleNumbers[i][j].add((char) ('0' + k));
                }
            }
        }
        solve();
    }

    private void solve() {
        while (!isSolved()) {
            if (!canBeSolved()) {
                return;
            }
            int numberOfZeroes = getNumberOfZeroes();
            solveForRowsAndColumns();
            solveForSquares();
            enterASolvedCell();
            if (numberOfZeroes == getNumberOfZeroes()) {
                solveWithTrialAndError();
            }
        }
    }

    private boolean isSolved() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '0')
                    return false;
            }
        }
        return true;
    }

    private void solveForRowsAndColumns() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '0') {
                    for (int k = 0; k < 9; k++) {
                        Character ch = sudoku[i][k];
                        possibleNumbers[i][j].remove(ch);
                    }
                }
                if (sudoku[j][i] == '0') {
                    for (int k = 0; k < 9; k++) {
                        Character ch = sudoku[k][i];
                        possibleNumbers[j][i].remove(ch);
                    }
                }
            }
        }
    }

    private void solveForSquares() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '0') {
                    for (int k = i - 2; k <= i + 2; k++) {
                        for (int l = j - 2; l <= j + 2; l++) {
                            if (k >= 0 && k < 9 && l >= 0 && l < 9 && i / 3 == k / 3 && j / 3 == l / 3) {
                                Character ch = sudoku[k][l];
                                possibleNumbers[i][j].remove(ch);
                            }
                        }
                    }
                }
            }
        }
    }

    private void enterASolvedCell() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '0' && possibleNumbers[i][j].size() == 1) {
                    sudoku[i][j] = possibleNumbers[i][j].get(0);
                    return;
                }
            }
        }
    }

    private void solveWithTrialAndError() {
        //WE CHOOSE AN EMPTY CELL AND DECIDE ITS NUMBER WITH TRIAL AND ERROR
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '0') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '0' && possibleNumbers[x][y].size() > possibleNumbers[i][j].size()) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        Character[][] newSudoku = new Character[9][9];
        copySudoku(sudoku, newSudoku);
        for (int i = 0; i < possibleNumbers[x][y].size(); i++) {
            newSudoku[x][y] = possibleNumbers[x][y].get(i);
            Sudoku testSudoku = new Sudoku(newSudoku);
            if (testSudoku.canBeSolved()) {
                this.sudoku = testSudoku.getSudoku();
                break;
            } else if (i == possibleNumbers[x][y].size() - 1) {
                possibleNumbers[x][y] = new ArrayList<>();
            }
        }
    }

    private int getNumberOfZeroes() {
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '0')
                    counter++;
            }
        }
        return counter;
    }

    public boolean canBeSolved() {
        if (invalidInput())
            return false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (possibleNumbers[i][j].size() == 0 && sudoku[i][j] == '0') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean invalidInput() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        if (sudoku[i][j] != '0' && sudoku[k][l] != '0' && sudoku[i][j] == sudoku[k][l] && (i != k || j != l)) {
                            if (i == k || j == l || (i / 3 == k / 3 && j / 3 == l / 3)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder toString = new StringBuilder();
        if (!canBeSolved()) {
            toString = new StringBuilder("The entered sudoku is invalid and cannot be solved! Please check that you have entered the numbers correctly!");
        } else {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    toString.append(sudoku[i][j]);
                    if (j == 2 || j == 5)
                        toString.append("|");
                }
                toString.append("\n");
                if (i == 2 || i == 5)
                    toString.append("____________\n");
            }
        }
        return toString.toString();
    }

    public void copySudoku(Character[][] copiedFrom, Character[][] copiedTo) {
        for (int i = 0; i < 9; i++) {
            System.arraycopy(copiedFrom[i], 0, copiedTo[i], 0, 9);
        }
    }
}
