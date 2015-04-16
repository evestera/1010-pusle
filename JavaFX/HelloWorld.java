import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;

public class HelloWorld extends Application {
    public void start(Stage stage) {
        Text text = new Text("Hello World!");
        BorderPane pane = new BorderPane(text);
        pane.setPadding(new Insets(50));
        Scene scene = new Scene(pane);

        stage.setTitle("myApp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}