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

        displayHighScorePosition("Dez", calculateHighScorePosition(1000));

        displayHighScorePosition("Nick", calculateHighScorePosition(500));

        displayHighScorePosition("Rhiannon", calculateHighScorePosition(100));

        displayHighScorePosition("Mary", calculateHighScorePosition(30));

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

        // more readable solution
        int position = 4; // assuming position 4 will be returned
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;

        // initial solution
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

    }


}
