package application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class MenuController {
	

    // PLAY BUTTON
	@FXML
	private void handlePlay(ActionEvent event) throws Exception {
	    Parent root = FXMLLoader.load(getClass().getResource("quiz.fxml"));
	    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    stage.getScene().setRoot(root);
	}
    
    // SCORE BUTTON
    @FXML
    private void handleScore(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Score.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.getScene().setRoot(root);
    }


    // SETTINGS BUTTON
    @FXML
    private void handleSettings(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.getScene().setRoot(root);
    }

    // EXIT BUTTON
    @FXML
    private void handleExit(ActionEvent event) {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }
}
