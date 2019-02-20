package view;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.fxml.FXMLLoader;



public class Main extends Application {
	@Override
	public void start(Stage stage)throws Exception {
		
		TabPane root = FXMLLoader.load(getClass().getResource("MagicSquare.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(Main.class.getResource("Sheet1.css").toExternalForm());
			stage.setTitle("MS: MAGIC SQUARE");
			stage.setScene(scene);
			stage.show();
		} 
	
	public static void main(String[] args) {
		launch(args);
	}
}


