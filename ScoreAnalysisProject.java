package homework1vencypatel;

// program: Analyze Scores
// programmer name: Vency Patel

import java.util.Random;

public class ScoreAnalysisProject {

    public static void displayScores(int[] scores) {

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static double average(int[] scores) {

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return (double) sum / scores.length;
    }

    public static int aboveOrEqualAverage(int[] scores, double avg) {

        int count = 0;

        for (int score : scores) {
            if (score >= avg) {
                count++;
            }
        }

        return count;
    }

    public static void rangeCount(int[] scores) {

        int[] range = new int[10];

        for (int score : scores) {
            if (score == 100) {
                range[9]++;
            } else {
                range[score / 10]++;
            }
        }

        for (int i = 0; i < range.length; i++) {

            if (i == 9) {
                System.out.println("90 to 100 : " + range[i]);
            } else {
                System.out.println((i * 10) + " to " + (i * 10 + 9) + " : " + range[i]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("HW1 Problem - Analyze Scores by Vency Patel");
        System.out.println();

        int[] scores = new int[100];
        Random rand = new Random();

        for (int i = 0; i < scores.length; i++) {
            scores[i] = rand.nextInt(101);
        }

        System.out.println("Scores:");
        displayScores(scores);

        double avg = average(scores);
        System.out.println();
        System.out.println("Average: " + avg);

        System.out.println("Scores above or equal to average: " + aboveOrEqualAverage(scores, avg));

        System.out.println();
        System.out.println("Score distribution:");
        rangeCount(scores);
    }
}