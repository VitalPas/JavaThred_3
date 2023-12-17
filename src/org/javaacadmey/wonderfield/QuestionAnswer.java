package org.javaacadmey.wonderfield;

public class QuestionAnswer {
    private String question;
    private String answer;

    public QuestionAnswer() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "QuestionAnswer{"
                + "question='" + question + '\''
                + ", answer='" + answer + '\''
                + '}';
    }
}
