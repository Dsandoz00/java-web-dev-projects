package quiz;

import java.util.List;

public class MultipleChoice extends Question {
    private List<String> options;
    private int correctOption;

    public MultipleChoice(String question, String userPrompt, List<String> options, int correctOption){
        super(question, userPrompt);
        this.options = options;
        this.correctOption = correctOption;
    }

    public boolean isAnswerCorrect(String userAnswer){
        return true;
    }
}
