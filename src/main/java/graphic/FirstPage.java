package graphic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FirstPage extends Application {
    private static AnchorPane anchorPane;
    public static Stage stage;

    @Override
    public void start(Stage stage1) throws Exception {
        stage = stage1;
        anchorPane = FXMLLoader.load(getClass().getResource("/sample/fxml/page.fxml"));
        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Sudoku Solver");
        stage.show();
    }
}
