package application;
import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class SettingsController{
	@FXML
    private void handleBackToMenu(ActionEvent event) throws Exception {
		 Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
	        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        stage.getScene().setRoot(root);
    }
	
}
