package quiz;

public class TrueOrFalse extends Question {
String correctAnswer;

public TrueOrFalse (String question, String userPrompt, String correctAnswer) {
    super(question, userPrompt);
    this.correctAnswer = correctAnswer;
}

public boolean isAnswerCorrect(String userAnswer) {
    return true;
}

}
