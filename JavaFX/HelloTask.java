import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.concurrent.*;
import java.util.concurrent.*;

public class HelloTask extends Application {
    Button button;
    ProgressBar progress;

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        button = new Button("Click me!");
        button.setOnAction(this::handleClick);
        grid.add(button, 0, 0);

        progress = new ProgressBar();
        progress.setProgress(0);
        grid.add(progress, 0, 1);

        Scene scene = new Scene(grid);

        stage.setTitle("Hello Task!");
        stage.setScene(scene);
        stage.show();
    }

    ExecutorService executor = Executors.newCachedThreadPool();

    @Override
    public void stop() {
        executor.shutdown();
    }

    public void handleClick(ActionEvent event) {
        Task<String> task = new Task<String>() {
            @Override
            protected String call() throws Exception {
                updateValue("Working...");

                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        return "Interrupted!";
                    }
                    updateProgress(i + 1, 10);
                }
                return "Done!";
            }
        };
        progress.progressProperty().bind(task.progressProperty());
        button.textProperty().bind(task.valueProperty());

        executor.submit(task);
    }
}