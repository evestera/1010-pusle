import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class PropertyExample extends Application {
    public void start(Stage stage) {
        TextField field = new TextField();
        Text text = new Text();

        text.textProperty().bind(field.textProperty());

        VBox box = new VBox(10, field, text);
        box.setPadding(new Insets(20));

        Scene scene = new Scene(box);

        stage.setTitle("Property Example");
        stage.setScene(scene);
        stage.show();
    }
}