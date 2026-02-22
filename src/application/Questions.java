package application;

import java.util.List;

public class Questions {

    private String text;
    private List<String> options;
    private int correctIndex;
    private String category;

    public String getText() {
        return text;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public String getCategory() {
        return category;
    }
}