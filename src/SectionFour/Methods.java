package SectionFour;

public class Methods {

    public static void main(String[] args) {

        System.out.println("Final Score = " + calculateScore(true, 800, 5, 100));
        System.out.println("Final Score = " + calculateScore(true, 10000, 8, 200));
        System.out.println("Final Score = " + calculateScore(false, 500, 500, 200));


        displayHighScorePosition("Jackie", calculateHighScorePosition(1500));

        displayHighScorePosition("Ian", calculateHighScorePosition(900));

        displayHighScorePosition("Adamina", calculateHighScorePosition(400));

        displayHighScorePosition("Kayla", calculateHighScorePosition(50));

    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.printf("%s managed to get into position %s on the high score table.%n", playerName, position);
    }
    public static int calculateHighScorePosition(int score) {
        if (score > 100 && score < 500) {
            return 3;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 1000) {
            return 1;
        } else {
            return 4;
        }
    }


}
