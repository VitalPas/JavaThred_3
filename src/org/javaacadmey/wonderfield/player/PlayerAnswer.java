package org.javaacadmey.wonderfield.player;

public class PlayerAnswer {
    private String typeAnswer;
    private String answer;

    public String getTypeAnswer() {
        return typeAnswer;
    }

    public void setTypeAnswer(String typeAnswer) {
        this.typeAnswer = typeAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public PlayerAnswer(String typeAnswer, String answer) {
        this.typeAnswer = typeAnswer;
        this.answer = answer;
    }

    public PlayerAnswer() {
    }

    @Override
    public String toString() {
        return "PlayerAnswer{"
                + "typeAnswer='" + typeAnswer + '\''
                + ", answer='" + answer + '\''
                + '}';
    }
}
