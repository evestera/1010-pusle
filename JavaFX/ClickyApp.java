import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;

public class ClickyApp extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("Click me!");
        button.setOnAction(this::handleButtonClick);
        BorderPane pane = new BorderPane(button);
        pane.setPadding(new Insets(50));
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