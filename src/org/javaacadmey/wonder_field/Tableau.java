package org.javaacadmey.wonder_field;

public class Tableau {
    private static String correctAnswer;
    private static String[] lettersOnTableau;

    public static void initTableau(String answer) {
        correctAnswer = answer;
        lettersOnTableau = new String[correctAnswer.length()];
        for (int i = 0; i < lettersOnTableau.length; i++) {
            lettersOnTableau[i] = "_";
        }
    }

    public static void showTableau() throws Exception {
        notNullCheck();
        System.out.println("");
        for (String letters :
                lettersOnTableau) {
            System.out.print(letters + " ");
        }
        System.out.println();
    }

    public static void openLetter(String letter) throws Exception {
        notNullCheck();
        String[] splitAnswer = correctAnswer.split("");
        for (int i = 0; i < lettersOnTableau.length; i++) {
            if (splitAnswer[i].equalsIgnoreCase(letter)) {
                lettersOnTableau[i] = letter.toUpperCase();
            }
        }
    }

    public static void openWord() {
        for (int i = 0; i < lettersOnTableau.length; i++) {
            lettersOnTableau[i] = String.valueOf(correctAnswer.charAt(i));
        }
    }

    public static boolean containsUnknownLetters() {
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

    private static void notNullCheck() throws Exception {
        if (correctAnswer == null || lettersOnTableau == null) {
            throw new Exception("В атрибутах Tableau null значение");
        }
    }
}





