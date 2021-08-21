package sudoku;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

public class SudokuCreator {
    public Label loading = new Label();
    public Label unsolvable = new Label();
    private Sudoku sudoku;
    public Button Cell11 = new Button();
    public Button Cell12 = new Button();
    public Button Cell13 = new Button();
    public Button Cell14 = new Button();
    public Button Cell15 = new Button();
    public Button Cell16 = new Button();
    public Button Cell17 = new Button();
    public Button Cell18 = new Button();
    public Button Cell19 = new Button();
    public Button Cell21 = new Button();
    public Button Cell22 = new Button();
    public Button Cell23 = new Button();
    public Button Cell24 = new Button();
    public Button Cell25 = new Button();
    public Button Cell26 = new Button();
    public Button Cell27 = new Button();
    public Button Cell28 = new Button();
    public Button Cell29 = new Button();
    public Button Cell31 = new Button();
    public Button Cell32 = new Button();
    public Button Cell33 = new Button();
    public Button Cell34 = new Button();
    public Button Cell35 = new Button();
    public Button Cell36 = new Button();
    public Button Cell37 = new Button();
    public Button Cell38 = new Button();
    public Button Cell39 = new Button();
    public Button Cell41 = new Button();
    public Button Cell42 = new Button();
    public Button Cell43 = new Button();
    public Button Cell44 = new Button();
    public Button Cell45 = new Button();
    public Button Cell46 = new Button();
    public Button Cell47 = new Button();
    public Button Cell48 = new Button();
    public Button Cell49 = new Button();
    public Button Cell51 = new Button();
    public Button Cell52 = new Button();
    public Button Cell53 = new Button();
    public Button Cell54 = new Button();
    public Button Cell55 = new Button();
    public Button Cell56 = new Button();
    public Button Cell57 = new Button();
    public Button Cell58 = new Button();
    public Button Cell59 = new Button();
    public Button Cell61 = new Button();
    public Button Cell62 = new Button();
    public Button Cell63 = new Button();
    public Button Cell64 = new Button();
    public Button Cell65 = new Button();
    public Button Cell66 = new Button();
    public Button Cell67 = new Button();
    public Button Cell68 = new Button();
    public Button Cell69 = new Button();
    public Button Cell71 = new Button();
    public Button Cell72 = new Button();
    public Button Cell73 = new Button();
    public Button Cell74 = new Button();
    public Button Cell75 = new Button();
    public Button Cell76 = new Button();
    public Button Cell77 = new Button();
    public Button Cell78 = new Button();
    public Button Cell79 = new Button();
    public Button Cell81 = new Button();
    public Button Cell82 = new Button();
    public Button Cell83 = new Button();
    public Button Cell84 = new Button();
    public Button Cell85 = new Button();
    public Button Cell86 = new Button();
    public Button Cell87 = new Button();
    public Button Cell88 = new Button();
    public Button Cell89 = new Button();
    public Button Cell91 = new Button();
    public Button Cell92 = new Button();
    public Button Cell93 = new Button();
    public Button Cell94 = new Button();
    public Button Cell95 = new Button();
    public Button Cell96 = new Button();
    public Button Cell97 = new Button();
    public Button Cell98 = new Button();
    public Button Cell99 = new Button();
    private Button[][] buttons;
    private Button selectedButton;

    private void mapButtons() {
        selectedButton = Cell11;
        buttons = new Button[9][9];
        buttons[0][0] = Cell11;
        buttons[0][1] = Cell12;
        buttons[0][2] = Cell13;
        buttons[0][3] = Cell14;
        buttons[0][4] = Cell15;
        buttons[0][5] = Cell16;
        buttons[0][6] = Cell17;
        buttons[0][7] = Cell18;
        buttons[0][8] = Cell19;
        buttons[1][0] = Cell21;
        buttons[1][1] = Cell22;
        buttons[1][2] = Cell23;
        buttons[1][3] = Cell24;
        buttons[1][4] = Cell25;
        buttons[1][5] = Cell26;
        buttons[1][6] = Cell27;
        buttons[1][7] = Cell28;
        buttons[1][8] = Cell29;
        buttons[2][0] = Cell31;
        buttons[2][1] = Cell32;
        buttons[2][2] = Cell33;
        buttons[2][3] = Cell34;
        buttons[2][4] = Cell35;
        buttons[2][5] = Cell36;
        buttons[2][6] = Cell37;
        buttons[2][7] = Cell38;
        buttons[2][8] = Cell39;
        buttons[3][0] = Cell41;
        buttons[3][1] = Cell42;
        buttons[3][2] = Cell43;
        buttons[3][3] = Cell44;
        buttons[3][4] = Cell45;
        buttons[3][5] = Cell46;
        buttons[3][6] = Cell47;
        buttons[3][7] = Cell48;
        buttons[3][8] = Cell49;
        buttons[4][0] = Cell51;
        buttons[4][1] = Cell52;
        buttons[4][2] = Cell53;
        buttons[4][3] = Cell54;
        buttons[4][4] = Cell55;
        buttons[4][5] = Cell56;
        buttons[4][6] = Cell57;
        buttons[4][7] = Cell58;
        buttons[4][8] = Cell59;
        buttons[5][0] = Cell61;
        buttons[5][1] = Cell62;
        buttons[5][2] = Cell63;
        buttons[5][3] = Cell64;
        buttons[5][4] = Cell65;
        buttons[5][5] = Cell66;
        buttons[5][6] = Cell67;
        buttons[5][7] = Cell68;
        buttons[5][8] = Cell69;
        buttons[6][0] = Cell71;
        buttons[6][1] = Cell72;
        buttons[6][2] = Cell73;
        buttons[6][3] = Cell74;
        buttons[6][4] = Cell75;
        buttons[6][5] = Cell76;
        buttons[6][6] = Cell77;
        buttons[6][7] = Cell78;
        buttons[6][8] = Cell79;
        buttons[7][0] = Cell81;
        buttons[7][1] = Cell82;
        buttons[7][2] = Cell83;
        buttons[7][3] = Cell84;
        buttons[7][4] = Cell85;
        buttons[7][5] = Cell86;
        buttons[7][6] = Cell87;
        buttons[7][7] = Cell88;
        buttons[7][8] = Cell89;
        buttons[8][0] = Cell91;
        buttons[8][1] = Cell92;
        buttons[8][2] = Cell93;
        buttons[8][3] = Cell94;
        buttons[8][4] = Cell95;
        buttons[8][5] = Cell96;
        buttons[8][6] = Cell97;
        buttons[8][7] = Cell98;
        buttons[8][8] = Cell99;
    }

    public void create(ActionEvent actionEvent) {
        if (selectedButton != null){
            selectedButton.setStyle("-fx-background-color: #ffffff; ");
        }
        mapButtons();
        loading.setText("Loading ...");
        Character[][] sudokuInput = new Character[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (buttons[i][j].getText().isEmpty())
                    sudokuInput[i][j] = '0';
                else
                    sudokuInput[i][j] = buttons[i][j].getText().charAt(0);
            }
        }
        loading.setText("Finished!");
        sudoku = new Sudoku(sudokuInput);
        showOutput();
    }

    private void showOutput() {
        if (sudoku.canBeSolved()) {
            Character[][] solved = sudoku.getSudoku();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    buttons[i][j].setText(solved[i][j].toString());
                }
            }
        } else {
            loading.setText("");
            unsolvable.setText("This Sudoku cannot be solved! check your input and try again!");
        }
    }

    public void reset(ActionEvent actionEvent) {
        if (selectedButton != null){
            selectedButton.setStyle("-fx-background-color: #ffffff; ");
        }
        mapButtons();
        loading.setText("");
        unsolvable.setText("");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j].setText("");
            }
        }
    }


    public void select(ActionEvent actionEvent) {
        if (selectedButton != null){
            selectedButton.setStyle("-fx-background-color: #ffffff; ");
        }
        selectedButton = (Button) actionEvent.getSource();
        selectedButton.setStyle("-fx-background-color: #e9e6e6; ");
    }

    public void insert(ActionEvent actionEvent) {
        String id = ((Button) actionEvent.getSource()).getId();
        if (id.equals("Clear"))
            selectedButton.setText("");
        else {
            selectedButton.setText(id.substring(6));
            selectedButton.setTextFill(Paint.valueOf("#FF0000"));
        }
    }
}
