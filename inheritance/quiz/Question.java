package quiz;

public abstract class Question {
    public String question;
    public String userPrompt;
    public abstract boolean isAnswerCorrect(String userAnswer);

    public Question (String question, String userPrompt) {
        this.question = question;
        this.userPrompt = userPrompt;
    }
}
