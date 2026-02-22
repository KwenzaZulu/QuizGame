package application;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;

public class QuizController {

    // UI Elements
    @FXML
    private Label questionLabel;

    @FXML
    private RadioButton option1;

    @FXML
    private RadioButton option2;

    @FXML
    private RadioButton option3;

    @FXML
    private RadioButton option4;

    // Quiz Data
    private List<Questions> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;

    private ToggleGroup group;

    // This runs automatically when the page loads
    @FXML
    public void initialize() {
        group = new ToggleGroup();

        option1.setToggleGroup(group);
        option2.setToggleGroup(group);
        option3.setToggleGroup(group);
        option4.setToggleGroup(group);

        loadQuestions();
        showQuestion();
    }

    // Load JSON file
    private void loadQuestions() {
        try {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Questions>>(){}.getType();

            InputStreamReader reader =
                    new InputStreamReader(getClass().getResourceAsStream("questions.json"));

            questions = gson.fromJson(reader, listType);
            reader.close();

            System.out.println("Loaded: " + questions.size() + " questions");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display current question
    private void showQuestion() {
        Questions q = questions.get(currentQuestionIndex);

        questionLabel.setText(q.getText());

        option1.setText(q.getOptions().get(0));
        option2.setText(q.getOptions().get(1));
        option3.setText(q.getOptions().get(2));
        option4.setText(q.getOptions().get(3));

        // Clear previous selection
        group.selectToggle(null);
    }

    // Handle submit button
    @FXML
    private void handleSubmit(ActionEvent event) {

        if (group.getSelectedToggle() == null) {
            System.out.println("Please select an answer.");
            return;
        }

        int selectedIndex = -1;

        if (option1.isSelected()) selectedIndex = 0;
        if (option2.isSelected()) selectedIndex = 1;
        if (option3.isSelected()) selectedIndex = 2;
        if (option4.isSelected()) selectedIndex = 3;

        Questions q = questions.get(currentQuestionIndex);

        if (selectedIndex == q.getCorrectIndex()) {
            score++;
        }

        currentQuestionIndex++;

        if (currentQuestionIndex < questions.size()) {
            showQuestion();
        } else {
            System.out.println("Quiz finished!");
            System.out.println("Final Score: " + score + "/" + questions.size());
        }
    }
}