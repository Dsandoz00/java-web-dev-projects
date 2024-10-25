package quiz;

import java.util.List;

public class Checkbox extends Question {
    private List<String> options;
    private List<String> correctOptions;

    public Checkbox(String question, String userPrompt, List<String> options, List<String> correctOptions){
        super(question, userPrompt);
        this.options = options;
        this.correctOptions = correctOptions;
    }

    public boolean isAnswerCorrect(String userAnswer){
        return true;
    }

}
