package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
        private Stage primaryStage;
    
	@Override
	public void start(Stage primaryStage) throws IOException {
	    this.primaryStage = primaryStage;
	    Parent root = FXMLLoader.load(Main.class.getResource("/application/View.fxml"));
	    Scene scene = new Scene(root);
	    this.primaryStage.setScene(scene);
	    this.primaryStage.setTitle("Basic Game");
	    this.primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
