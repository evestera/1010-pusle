import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.event.*;
import java.io.IOException;
import java.net.URL;

public class FxmlExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL fxml = FxmlExample.class.getResource("FxmlExample.fxml");
        Parent pane = FXMLLoader.load(fxml);
        Scene scene = new Scene(pane);

        stage.setTitle("Clicky app");
        stage.setScene(scene);
        stage.show();
    }

    public void handleButtonClick(ActionEvent event) {
        new Alert(Alert.AlertType.INFORMATION, "You clicked the button!")
            .showAndWait();
    }
}