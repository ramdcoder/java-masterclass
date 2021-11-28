package SectionFour;

public class Methods {

    public static void main(String[] args) {

        System.out.println("Final Score = " + calculateScore(true, 800, 5, 100));
        System.out.println("Final Score = " + calculateScore(true, 10000, 8, 200));
        System.out.println("Final Score = " + calculateScore(false, 500, 500, 200));
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = 0;
//        if (gameOver){
//            finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//        } else {
//            finalScore = -1;
//        }
//        return finalScore;

        // refactor
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }


}
