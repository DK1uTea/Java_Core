import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Color_Circle extends Application{

    @Override
    public void start(Stage s) throws Exception {
        Pane p = new HBox();
        
        Circle c1 = new Circle(150, 150, 50);
        Circle c2 = new Circle(150, 150, 50);
        Circle c3 = new Circle(150, 150, 50);

        c1.setFill(Color.RED);
        c2.setFill(Color.color(0, 1, 0));
        c3.setStyle("-fx-fill:blue;");

        p.getChildren().addAll(c1, c2, c3);
        s.setTitle("Color");
        s.setScene(new Scene(p, 300, 300));
        s.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
