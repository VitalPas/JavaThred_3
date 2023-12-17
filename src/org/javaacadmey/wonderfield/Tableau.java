package org.javaacadmey.wonderfield;

public class Tableau {
    private String correctAnswer;
    private String[] lettersOnTableau;

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
        for (String letters : lettersOnTableau) {
            if (letters.equals("_")) {
                return true;
            }
        }
        return false;
    }

    private void notNullCheck() {
        if (correctAnswer == null || lettersOnTableau == null) {
            throw new RuntimeException("В атрибутах Tableau null значение");
        }
    }
}





