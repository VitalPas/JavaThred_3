package org.javaacadmey.wonderfield;

public class Tableau {
    private String correctAnswer;
    private String[] lettersOnTableau;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String[] getLettersOnTableau() {
        return lettersOnTableau;
    }

    public void setLettersOnTableau(String[] lettersOnTableau) {
        this.lettersOnTableau = lettersOnTableau;
    }

    public Tableau(String correctAnswer, String[] lettersOnTableau) {
        this.correctAnswer = correctAnswer;
        this.lettersOnTableau = lettersOnTableau;
    }

    public Tableau() {
    }

    public void initTableau(String answer) {
        correctAnswer = answer;
        lettersOnTableau = "_".repeat(answer.length()).split("");
    }

    public void showTableau() {
        notNullCheck();
        System.out.println("");
        for (String letters :
                lettersOnTableau) {
            System.out.print(letters + " ");
        }
        System.out.println();
    }

    public void openLetter(String letter) {
        notNullCheck();
        String[] splitAnswer = correctAnswer.split("");
        for (int i = 0; i < lettersOnTableau.length; i++) {
            if (splitAnswer[i].equalsIgnoreCase(letter)) {
                lettersOnTableau[i] = letter.toUpperCase();
            }
        }
    }

    public void openWord() {
        for (int i = 0; i < lettersOnTableau.length; i++) {
            lettersOnTableau[i] = String.valueOf(correctAnswer.charAt(i));
        }
    }

    public boolean containsUnknownLetters() {
        boolean result = true;
        for (String letters : lettersOnTableau) {
            if (letters.equals("_")) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    private void notNullCheck() {
        if (correctAnswer == null || lettersOnTableau == null) {
            throw new RuntimeException("В атрибутах Tableau null значение");
        }
    }
}





