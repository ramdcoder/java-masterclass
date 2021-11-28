package SectionFour;

public class Keywords_Expressions {

    public static void main(String[] args) {

        // whitespace work
//        int randVar = 50;
//        randVar++;
//        --randVar;
//        System.out.println("randVar = " + randVar);
//
//        System.out.println("Ths is" +
//                " another " +
//                "line.");

        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Score is less than 5000 but more than 1000");
        } else if (score < 1000) {
            System.out.println("score less than 1000");
        } else {
            System.out.println("\"Got here\"");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);

            System.out.println("finalScore = " + finalScore);
        }

        int secondScore = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int secondFinalScore = secondScore + (levelCompleted * bonus);
            System.out.println("secondFinalScore = " + secondFinalScore);
        }

    }


}
